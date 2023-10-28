import folium

name_list = [['kyiv', 406], ['kharkiv', 234], ['kherson', 129], ['odessa', 117], ['lviv', 106], ['chernihiv', 97], ['sumy', 83], ['donetsk', 80], ['zaporizhzhia', 56]]

m = folium.Map(location=[0, 0], tiles='Stamen Toner', zoom_start=3)

country_data = [
    {"country": "Kyiv", "samples": name_list[0][1], "latlong" : [50.474167, 30.560135]},
    {"country": "Kharkiv", "samples": name_list[1][1], "latlong" : [49.983208, 36.280183]},
    {"country": "Kherson", "samples": name_list[2][1], "latlong" : [46.656281, 32.615506]},
    {"country": "Odessa", "samples": name_list[3][1], "latlong" : [46.460179, 30.715562]},
    {"country": "Lviv", "samples": name_list[4][1], "latlong" : [49.844395, 24.007428]},
    {"country": "Chernihiv", "samples": name_list[5][1], "latlong" : [51.503873, 31.275774]},
    {"country": "Sumy", "samples": name_list[6][1], "latlong" : [50.903018, 34.806659]},
    {"country": "Donetsk", "samples": name_list[7][1], "latlong" : [48.002865, 37.817820]},
    {"country": "Zaporizhzhia", "samples": name_list[8][1], "latlong" : [47.860258, 35.156122]},
]

for data in country_data:
    country_name = data["country"]
    sample_count = data["samples"]
    latlong = data["latlong"]

    marker = folium.CircleMarker(
        location=latlong,  
        radius=sample_count*0.05,
        color="blue",
        fill=True,
        fill_color="blue",
        fill_opacity=0.6,
    )
    popup = folium.Popup(f"{country_name}: {sample_count} samples", permanent=True)
    popup.add_to(marker)
    marker.add_to(m)

m.save("Assignment_2_work/Python_code/Ukraine_map.html")
