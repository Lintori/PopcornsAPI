databaseName = 'rebyu-db'

db.auth('root', 'rootpass')
db = db.getSiblingDB(databaseName)

db.createUser({
    user: 'rebyuer',
    pwd: 'rebyuerpass',
    roles: [
        {
            role: 'readWrite',
            db: databaseName,
        }
    ]
});