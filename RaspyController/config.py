#!/usr/bin/env python2
# -*- coding: utf-8 -*-
"""
Created on Thu Jun 28 18:54:51 2018

@author: pi
"""
from configparser import ConfigParser

def config(filename='database.ini', section='postgresql'):
    #create a parser
    parser=ConfigParser()
    #read config file
    parser.read(filename)
    
    # get section, default to postgresql
    db={}
    if parser.has_section(section):
        params=parser.items(section)
        for param in params:
            db[param[0]]=param[1]
    else:
        raise Exception('Section {0} not found in the {1}'.format(section, filename))
        
    return db

