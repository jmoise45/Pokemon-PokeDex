# hackdukeproject
<link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons">
<link rel="stylesheet" href="https://code.getmdl.io/1.2.1/material.indigo-pink.min.css">
<script defer src="https://code.getmdl.io/1.2.1/material.min.js"></script>
<div class="mdl-tabs mdl-js-tabs mdl-js-ripple-effect">
    <style>
.demo-layout-transparent {
  background: url('C:/Git/material-design-lite/docs/_assets/demos/martham-broad-1440x900.jpg') center / cover;
}
.demo-layout-transparent .mdl-tabs__tab, .demo-layout-transparent .mdl-layout__content, .demo-layout-transparent .mdl-layout__header,
.demo-layout-transparent .mdl-layout__drawer-button {
  /* This background is dark, so we set text to white. Use 87% black instead if
     your background is light. */
  color: white;
}
        .demo-card-wide.mdl-card {
  width: 512px;
}
.demo-card-wide > .mdl-card__title {
  color: #fff;
  height: 176px;
  background: url('../assets/demos/welcome_card.jpg') center / cover;
}
.demo-card-wide > .mdl-card__menu {
  color: #fff;
}
</style>
<div class="demo-layout-transparent mdl-layout mdl-js-layout">
  <header class="mdl-layout__header mdl-layout__header--scroll">
    <div class="mdl-layout__header-row">
      <!-- Title -->
      <span class="mdl-layout-title">FitConnect</span>
      <!-- Add spacer, to align navigation to the right -->
      <div class="mdl-layout-spacer"></div>
      <!-- Navigation -->
    </div>
  </header>
  <main class="mdl-layout__content">
    <div class="mdl-tabs mdl-js-tabs mdl-js-ripple-effect">
  <div class="mdl-tabs__tab-bar">
    <a href="#about-panel" class="mdl-tabs__tab is-active">About</a>
    <a href="#members-panel" class="mdl-tabs__tab">Members</a>
    <a href="#albums-panel" class="mdl-tabs__tab">Map</a>
  </div>
  <div class="mdl-tabs__panel is-active" id="about-panel">
    <p><b>FitConnect</b> is a website that is designed to connect athletes who need someone to workout with at a gym nearby.</p>
    <p>This website may also be used by people of age 15 or older.</p>
      <body>
            <style>
.demo-card-wide.mdl-card {
  width: 512px;
}
.demo-card-wide > .mdl-card__title {
  color: #fff;
  height: 200px;
  background: url('C:/Git/material-design-lite/docs/_assets/demos/Exercise-Square.jpg') center / cover;
}
.demo-card-wide > .mdl-card__menu {
  color: #fff;
}
</style>

<div class="demo-card-wide mdl-card mdl-shadow--2dp">
  <div class="mdl-card__title">
    <h2 class="mdl-card__title-text">Get Fit</h2>
  </div>
  <div class="mdl-card__supporting-text">
    Welcome to FitConnect! Get fit while getting connected!
  </div>
  <div class="mdl-card__actions mdl-card--border">
    <a class="mdl-button mdl-button--colored mdl-js-button mdl-js-ripple-effect">
      Get Started
    </a>
  </div>
  <div class="mdl-card__menu">
    <button class="mdl-button mdl-button--icon mdl-js-button mdl-js-ripple-effect">
      <i class="material-icons">share</i>
    </button>
  </div>
</div>
        </body>
  </div>
  <div class="mdl-tabs__panel" id="members-panel">
    <p>The developers of this website are:
      <ul>
      <li>James Moise</li>
      <li>Delano Igbinoba</li>
      <li>Daniel Olatunji</li>
      </ul> 
      </p>
  </div>
  <div class="mdl-tabs__panel" id="albums-panel">
    <p>Find out who you can workout with</p>
      <html>
<head>
<script type="text/javascript" src="http://maps.googleapis.com/maps/api/js?sensor=false"></script>
<script language="javascript" type="text/javascript">

    var map;
    var geocoder;
    function InitializeMap() {

        var latlng = new google.maps.LatLng(-34.397, 150.644);
        var myOptions =
        {
            zoom: 8,
            center: latlng,
            mapTypeId: google.maps.MapTypeId.ROADMAP,
            disableDefaultUI: true
        };
        map = new google.maps.Map(document.getElementById("map"), myOptions);
    }

    function FindLocation() {
        geocoder = new google.maps.Geocoder();
        InitializeMap();
        var gym = "nearby gym";
        var address = document.getElementById("addressinput").value;
        geocoder.geocode({ 'address': address }, function (results, status) {
            if (status == google.maps.GeocoderStatus.OK) {
                map.setCenter(results[0].geometry.location);
                var marker = new google.maps.Marker({
                    map: map,
                    position: results[0].geometry.location
                });

            }
            else {
                alert("Geocode was not successful for the following reason: " + status);
            }
        });

    }


    function Button1_onclick() {
        FindLocation();
        
    }

    window.onload = InitializeMap;

</script>
</head>
<body>
<h2>Choose your location: </h2>
<table>
<tr>
<td>
    <input id="addressinput" type="text" style="width: 447px" />   
</td>
<td>
    <input id="Button1" type="button" value="Find" onclick="return Button1_onclick()" /></td>
</tr>
<tr>
<td colspan ="2">
<div id ="map" style="height: 253px" >
</div>
</td>
</tr>
</table>
</body>
</html>
  </div>
</div>
  </main>
</div>
    
