from dbManager import dbManager

host_name = "localhost"
user_name = "root"
user_password = "MazzoDevelopments"
db_name = "gcaMazzo"



db = dbManager(host_name,user_name,user_password,db_name)

print(db.create_connection())

datos = db.fetch_all('SELECT * FROM companies')
print(datos)