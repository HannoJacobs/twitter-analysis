import folium
sorted_country_name_freq = [['usa_', 9577], ['india_', 5645], ['uk_', 3328], ['italy_', 2184], ['japan_', 1912], ['france', 1662], ['australia_', 1065], ['canada_', 971], ['germany_', 428]]

m = folium.Map(location=[0, 0], zoom_start=1)

country_data = [
    {"country": "USA", "samples": sorted_country_name_freq[0][1], "latlong" : [40.999509, -106.211875]},
    {"country": "India", "samples": sorted_country_name_freq[1][1], "latlong" : [21.722036, 78.174873]},
    {"country": "UK", "samples": sorted_country_name_freq[2][1], "latlong" : [54.371577, -2.761198]},
    {"country": "Italy", "samples": sorted_country_name_freq[3][1], "latlong" : [42.617711, 12.140850]},
    {"country": "Japan", "samples": sorted_country_name_freq[4][1], "latlong" : [36.691315, 139.022813]},
    {"country": "France", "samples": sorted_country_name_freq[5][1], "latlong" : [47.103278, 2.558051]},
    {"country": "Australia", "samples": sorted_country_name_freq[6][1], "latlong" : [-24.930005, 136.931204]},
    {"country": "Canada", "samples": sorted_country_name_freq[7][1], "latlong" : [57.991841, -106.849465]},
    {"country": "Germany", "samples": sorted_country_name_freq[8][1], "latlong" : [50.863535, 10.038831]},
]

for data in country_data:
    country_name = data["country"]
    sample_count = data["samples"]
    latlong = data["latlong"]

    folium.CircleMarker(
        location=latlong,
        radius=sample_count*0.005,
        color="blue",
        fill=True,
        fill_color="blue",
        fill_opacity=0.6,
        popup=f"{country_name}: {sample_count} samples",
    ).add_to(m)

m.save("Assignment_2_work/Python_code/World_map.html")
