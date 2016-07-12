function validate()
{
	
	var uname=document.forms["loginform"]["userId"].value;
	var password=document.forms["loginform"]["password"].value;

if (uname=="" || uname ==null||(/\D/.test(uname)))
	{
	alert("Please enter a valid user id");
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