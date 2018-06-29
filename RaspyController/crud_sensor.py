#!/usr/bin/env python2
# -*- coding: utf-8 -*-
"""
Created on Thu Jun 28 21:21:51 2018

@author: pi
"""

import psycopg2
from config import config

def insert_medida(var_a, var_b, var_c):
    """ insertar una nueva medida en la tabla table"""
    sql="""INSERT INTO medida(sensor_id, created_at , saturacion, temperatura) VALUES(%s,NOW(),%s,%s);"""
    
    conn=None
    #sensor_id=None
    status=True
    
    try:
        #read database configuration
        params=config()
        conn=psycopg2.connect(**params)
        # create a new cursor
        cur=conn.cursor()
        #execute the Insert statement
        cur.execute(sql, (var_a,var_b, var_c))
        #get the generated id back
        #sensor_id=cur.fetchone()[0]
        # commit the changes to the database
        conn.commit()
        # close communication with the database
        cur.close()
    except (Exception, psycopg2.DatabaseError) as error:
        print(error)
        status=False
        
    finally:
        if conn is not None:
            conn.close()
            
    return status




def consult_id(var_id):
    """ insertar una nueva medida en la tabla table"""
    sql="""SELECT id, direccion, ciudad FROM sensor WHERE id=%s ;"""
    
    conn=None
    sensor_id=None
    
    try:
        #read database configuration
        params=config()
        conn=psycopg2.connect(**params)
        # create a new cursor
        cur=conn.cursor()
        #execute the Insert statement
        cur.execute(sql, var_id)
        #get the generated id back
        sensor_id=cur.fetchone()[0]
        # commit the changes to the database
        conn.commit()
        # close communication with the database
        cur.close()
    except (Exception, psycopg2.DatabaseError) as error:
        print(error)
    finally:
        if conn is not None:
            conn.close()
            
    return sensor_id

def insert_sensor(direccion,ciudad):
    """ insertar una nueva medida en la tabla table"""
    sql="""INSERT INTO sensor(direccion, ciudad) VALUES(%s,%s) RETURNING id;"""
    
    conn=None
    sensor_id=None
    
    try:
        #read database configuration
        params=config()
        conn=psycopg2.connect(**params)
        # create a new cursor
        cur=conn.cursor()
        #execute the Insert statement
        cur.execute(sql, (direccion,ciudad,))
        #get the generated id back
        sensor_id=cur.fetchone()[0]
        # commit the changes to the database
        conn.commit()
        # close communication with the database
        cur.close()
    except (Exception, psycopg2.DatabaseError) as error:
        print(error)
    finally:
        if conn is not None:
            conn.close()
            
    return sensor_id
    