function validate()
{
	
	var uname=document.forms["createform"]["username"].value;
	var password=document.forms["createform"]["password"].value;
	var age=document.forms["createform"]["age"].value;
	var email=document.forms["createform"]["email"].value;
	var number=document.forms["createform"]["number"].value;
	var re = /\S+@\S+\.\S+/;


if (uname=="" || uname ==null)
	{
	alert("user name is required");
	return false;
	}
else if (password=="" || password ==null)
	{
	alert("password is required");
	return false;
	}
else if(age<5||age>80)
	{
	alert("enter a valid age");
	return false;
	
	}
else if(re.test(email)==false)
	{
	alert("enter a valid mail id");
	return false;
	
	}
else if(number.length<10)
	{
	alert("enter a valid contact number");
	return false;
	
	}
else
	{
	return true;
	}

}