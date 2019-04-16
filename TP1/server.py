from flask import Flask,request, jsonify
app=Flask(__name__)

port=4000
ip="192.168.1.4"      

"cambiar de acuerdo a la ip de mi pc"

@app.route('/')
def ciao():
	return "hola"

app.run(ip,port)
