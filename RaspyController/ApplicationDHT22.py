#!/usr/bin/env python2
# -*- coding: utf-8 -*-
"""
Created on Thu Jun 28 20:37:52 2018

@author: Felipe Quezada
"""

import sys
import time
import Adafruit_DHT
import crud_sensor
sensor_id=1
direccion='Las Quilas 1761'
ciudad='Temuco'

# 
def agregar_sensor():
    cs=crud_sensor
    cs.insert_sensor(direccion,ciudad)
    
    

def genesis():
    
    sensor = Adafruit_DHT.DHT22
    cs=crud_sensor

    pin = 4

    while True:
        humidity, temperature = Adafruit_DHT.read_retry(sensor, pin)
        #ahora=time.strftime("%H:%M:%S") 
        ahora=time.strftime("%c")


        if humidity is not None and temperature is not None:
            print("Fecha y hora %s"  % ahora)
            print('Temp={0:0.1f}*  Humidity={1:0.1f}%'.format(temperature, humidity))
            cs.insert_medida(sensor_id,humidity,temperature)
        else:
            print('Failed to get reading. Try again!')
            sys.exit(1) 
            
        time.sleep(3)
    
if __name__== '__main__':
    genesis()
    #agregar_sensor()
    
