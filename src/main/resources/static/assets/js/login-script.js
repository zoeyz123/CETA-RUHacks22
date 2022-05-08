console.log("lol wut");

const signInForm = document.getElementById("sign-in");
const signUpForm = document.getElementById("sign-up");

const passwordPane = document.getElementById("password");
const submitButton = document.getElementById("login")

const displayName = document.createElement("input");
displayName.setAttribute("type", "text");
displayName.setAttribute("id", "displayName");
displayName.setAttribute("name", "display name");
displayName.setAttribute("placeholder", "display name");

const loginForm = document.getElementById("login-form")

signInForm.addEventListener("click", function() {
    signInForm.setAttribute("class", "active");
    signUpForm.setAttribute("class", "inactive underlineHover");
    displayName.remove();
    submitButton.setAttribute("value", "Log In");
});

signUpForm.addEventListener("click", function() {
     signUpForm.setAttribute("class", "active");
     signInForm.setAttribute("class", "inactive underlineHover");
     passwordPane.parentNode.insertBefore(displayName, passwordPane.nextSibling);
      submitButton.setAttribute("value", "Register");
});

submitButton.addEventListener("click", function(e) {
    e.preventDefault();
    const email = loginForm.email.value;
    const password = loginForm.password.value;

    if (email == "user" && password == "web_dev") {
        alert("You have successfully logged in.");
        window.location.href = "/inner-page.html";
    } else {
        alert("Incorrect credentials");
    }
});

//fun register() {
//    fetch("/profiles", {
//        method: "POST",
//        headers: {
//            "Content-Type": "application/json"
//        },
//        body: JSON.stringify({ email: "demo@example.com", password: "password", displayName: "demo" })
//    })
//}


