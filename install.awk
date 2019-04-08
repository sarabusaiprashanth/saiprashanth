BEGIN{
	top = 0
	FS = ","
}
#Body
{
if ($1 ~ /==/)
{
	if (system("pip install "$1)){
		top = $top+1
		failed[top] = $1
	}
}
}
END{
	if(top){
		print "Failed to install the following:"
		for(i=1; i<=top; i++) print failed[i]
	}else{
		print "Success"
	}
}
