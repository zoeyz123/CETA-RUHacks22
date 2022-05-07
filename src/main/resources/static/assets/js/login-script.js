console.log("lol wut");

const signInForm = document.getElementById("sign_in");
const signUpForm = document.getElementById("sign_up");

const passwordPane = document.getElementById("password");
const submitButton = document.getElementById("login")

const display_name_btn = document.createElement("input");
display_name_btn.setAttribute("type", "text");
display_name_btn.setAttribute("id", "displayName");
display_name_btn.setAttribute("name", "display name");
display_name_btn.setAttribute("placeholder", "display name");

// <input type="text" id="displayName" class="fadeIn fourth" name="display name" placeholder="display name">

signInForm.addEventListener("click", function() {
    signInForm.setAttribute("class", "active");
    signUpForm.setAttribute("class", "inactive underlineHover");
    display_name_btn.remove();
    submitButton.setAttribute("value", "Log In");
});

signUpForm.addEventListener("click", function() {
     signUpForm.setAttribute("class", "active");
     signInForm.setAttribute("class", "inactive underlineHover");
     passwordPane.parentNode.insertBefore(display_name_btn, passwordPane.nextSibling);
      submitButton.setAttribute("value", "Register");
});

//fun register() {
//    fetch("/profiles", {
//        method: "POST",
//        headers: {
//            "Content-Type": "application/json"
//        },
//        body: JSON.stringify({ email: "demo@example.com", password: "password", displayName: "demo" })
//    })
}



