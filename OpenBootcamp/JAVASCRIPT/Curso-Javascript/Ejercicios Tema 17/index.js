/* - Crea un mapa en HTML
- Pon chinchetas en tus 3 lugares favoritos del planeta tierra */

// Initialize and add the map
function initMap() {
    // The location of Uluru
    const uluru = { lat: -25.344, lng: 131.031 };
    // The map, centered at Uluru
    const map = new google.maps.Map(document.getElementById("map"), {
      zoom: 4,
      center: uluru,
    });
    // The marker, positioned at Uluru
    const marker = new google.maps.Marker({
      position: uluru,
      map: map,
      title:"Posición Inicial"
    })

    const Coliseo = new google.maps.Marker({ 
        position: { lat: 41.89010051033451, lng:  12.492235318446099 },
        map: map,
        title:"Coliseo Romano, Roma"
      })

    const Tokyo = new google.maps.Marker({
        position: { lat: 35.680353231876204, lng: 139.7688182385925 },         
        map: map,
        title:"Tokio"
      });
    const LaHabana = new google.maps.Marker({
        position: { lat: 23.12084922389693, lng: -82.38832112217851 }, 
        map: map,
        title:"La Habana"
      });
  }
  
  window.initMap = initMap;