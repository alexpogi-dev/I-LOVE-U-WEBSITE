const correctPassword = "debut18"; // change this password


function checkPassword() {
const input = document.getElementById("password").value.trim();
const error = document.getElementById("error");
const login = document.getElementById("login");
const site = document.getElementById("site");


if (input === correctPassword) {
error.style.display = "none";
login.style.display = "none";
site.style.display = "block";
} else {
error.style.display = "block";
}
}


// allow Enter key to unlock
document.getElementById("password").addEventListener("keyup", function (e) {
if (e.key === "Enter") {
checkPassword();
}
});
}


function showSection(id) {
const sections = document.querySelectorAll('.section');
sections.forEach(section => section.style.display = 'none');
document.getElementById(id).style.display = 'block';
}
</script>


</body>
</html>