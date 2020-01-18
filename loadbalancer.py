#coding=utf-8

import requests
import threading


class getrequests():
    def __init__(self):
        self.url = 'http://localhost:30003/load-balancer'
 
    def get(self):
        try:
            r = requests.get(self.url)
            print(r.text)
        except Exception as e:
            print(e)
 
def request_test():
    test = getrequests()
    return test.get()

try:
    i = 0
    tasks_number = 100
    print('start test')
    while i < tasks_number:
        t = threading.Thread(target=request_test)
        t.start()
        i +=1
except Exception as e:
    print(e)