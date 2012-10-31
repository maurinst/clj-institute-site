start-project:
	lein new noir maurinst

deploy:
	heroku create --stack cedar
	git push heroku master
	heroku scale web=1

start-local-dev:
	lein run
