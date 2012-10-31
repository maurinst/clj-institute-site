start-project:
	lein new noir maurinst

deploy:
	heroku create --stack cedar
	git push heroku master
	heroku scale web=1
	heroku domains:add mauritiusinstitute.org
	heroku domains:add www.mauritiusinstitute.org

push:
	git push
	git push heroku master

start-local-dev:
	lein run
