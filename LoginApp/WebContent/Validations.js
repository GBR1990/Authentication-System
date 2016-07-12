function validate()
{
	
	var uname=document.forms["loginform"]["userId"].value;
	var password=document.forms["loginform"]["password"].value;

if (uname=="" || uname ==null)
	{
	alert("user id is required");
	return false;
	}
else if (password=="" || password ==null)
	{
	alert("password is required");
	return false;
	}
else
	{
	return true;
	}

}