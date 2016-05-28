<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet"%>


<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@taglib uri="http://liferay.com/tld/ui" prefix="lui"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta name="google-signin-client_id" content="683565683120-h8ik0q6kfmb9gb7195pn1k4676p6olis.apps.googleusercontent.com">
<!-- fb login code -->
<div id="fb-root"></div>
<script src="https://code.jquery.com/jquery-1.12.3.js"></script>
<script>
  window.fbAsyncInit = function() {
    FB.init({
      appId      : '478110472376558', // Set YOUR APP ID
      status     : true, // check login status
      cookie     : true, // enable cookies to allow the server to access the session
      xfbml      : true  // parse XFBML
    });
 
    FB.Event.subscribe('auth.authResponseChange', function(response) 
    {
     if (response.status === 'connected') 
    {
        document.getElementById("message").innerHTML +=  "<br>Connected to Facebook";
        //SUCCESS
 
    }    
    else if (response.status === 'not_authorized') 
    {
        document.getElementById("message").innerHTML +=  "<br>Failed to Connect";
 
        //FAILED
    } else 
    {
        document.getElementById("message").innerHTML +=  "<br>Logged Out";
 
        //UNKNOWN ERROR
    }
    }); 
 
    };
 
    function Login()
    {
 
        FB.login(function(response) {
           if (response.authResponse) 
           {
        	
        	   getUserInfo();
        	   getPhoto();
              
 
                document.facebookform.submit();

            } else 
            {
             console.log('User cancelled login or did not fully authorize.');
            }
         },{scope: 'email,user_photos,user_videos'});
 
    }
 
  function getUserInfo() {
	  debugger;
        FB.api('/me', function(respons) {
 
     var jsonString = JSON.stringify(respons)
     console.log(jsonString);
     $('#status').val(jsonString);
    });
    }
    function getPhoto()
    {debugger;
      FB.api('/me/picture?type=normal', function(response) {
    	  var jsonStrin = JSON.stringify(response)
    	       console.log(jsonStrin);

          $('#photo').val(jsonStrin);


    });
 
    }
    function Logout()
    {
        FB.logout(function(){document.location.reload();});
    }
 
  // Load the SDK asynchronously
  (function(d){
     var js, id = 'facebook-jssdk', ref = d.getElementsByTagName('script')[0];
     if (d.getElementById(id)) {return;}
     js = d.createElement('script'); js.id = id; js.async = true;
     js.src = "//connect.facebook.net/en_US/all.js";
     ref.parentNode.insertBefore(js, ref);
   }(document));
  
  $( document ).ready(function() {
	  $("#fbsubmit").on( 'click', (function(event)
			    {
			      event.preventDefault();
			      debugger;// cancel default behavior
	              Login();
			      //... rest of add logic
			    }))
	});
  function onSignIn(googleUser) {
      // Useful data for your client-side scripts:
      var profile = googleUser.getBasicProfile();
var googleProfileJson= JSON.stringify(profile);

$('#googlejson').val(googleProfileJson);

      // The ID token you need to pass to your backend:
      var id_token = googleUser.getAuthResponse().id_token;
      console.log("ID Token: " + id_token);
      document.facebookform.submit();

    };
</script>
<!--  -->
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<portlet:defineObjects />
<portlet:actionURL var="authenticate">
	<portlet:param name="action" value="authenticate" />
</portlet:actionURL>
<portlet:actionURL var="facebook">
	<portlet:param name="action" value="facebook" />
</portlet:actionURL>
<body>
<div class="g-signin2" data-onsuccess="onSignIn" data-theme="dark"></div>
 <script src="https://apis.google.com/js/platform.js" async defer></script>
<form:form action="${authenticate}" commandName="loginBean"
	method="POST">
${LoginMessage}
Enter your username:<input name="name" type="text" />
	<form:hidden path="username" id="username" />
Enter your password:<input name="password" type="text" />
	<form:hidden path="password" id="password" />
	<input name="token" type="text" style="display: none" value="${token}" />
	<form:hidden path="password" id="password" />
	<input type="submit" />
</form:form>
<form:form action="${facebook}" method="POST" name="facebookform">
    <input type="text" id="status" name="facebookemailJson">
        <input type="text" id="photo" name="facebookpicjson">
            <input type="text" id="googlejson">
        
    
	<input  type="submit" value="submit" id="fbsubmit" />
</form:form>
</body>
</html>