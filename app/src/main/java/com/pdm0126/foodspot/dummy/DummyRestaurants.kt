package com.pdm0126.foodspot.dummy

import com.pdm0126.foodspot.model.Dish
import com.pdm0126.foodspot.model.Restaurant

val restaurants = listOf(
  Restaurant(
    id = 1,
    name = "Cocteles El Marinero",
    description = "Platos de mariscos frescos y bebidas alcoholicas preparadas",
    imageUrl = "https://img.magnific.com/vector-gratis/logo-cangrejo-dibujado-mano_23-2149228426.jpg?semt=ais_hybrid&w=740&q=80",
    categories = listOf("Mariscos", "Bebidas"),
    menu = listOf(
      Dish(
        id = 1,
        name = "Coctel de pescado",
        description = "Coctel con pescado y vegetales en salsa de tomate o salsa rosada",
        imageUrl = "https://cdn7.kiwilimon.com/recetaimagen/29699/640x640/31117.jpg.jpg"
      ),
      Dish(
        id = 2,
        name = "Coctel de camarón",
        description = "Coctel con camarones y vegetales en salsa de tomate o salsa rosada",
        imageUrl = "https://cdn7.kiwilimon.com/recetaimagen/29699/640x640/31117.jpg.jpg"
      ),
      Dish(
        id = 3,
        name = "Tacos de pescado",
        description = "Tacos con pescado frito, ensalada de repollo y aguacate",
        imageUrl = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTTOKfonx9TblJUeIx6u_zxZJmcqdGmjwoYdw&s"
      ),
      Dish(
        id = 4,
        name = "Tacos de camarón",
        description = "Tacos con camarón frito, ensalada de repollo y aguacate",
        imageUrl = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTTOKfonx9TblJUeIx6u_zxZJmcqdGmjwoYdw&s"
      ),
      Dish(
        id = 5,
        name = "Pescado a la plancha",
        description = "Plato de pescado acompañado con arroz, ensalada, salsa y tortilla frita",
        imageUrl = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQP6ERCaEe36eXgrrgul0zfNpStovxHbMyA0g&s"
      ),
      Dish(
        id = 6,
        name = "Michelada",
        description = "Bebida preparada de cerveza con limón, chile y sal",
        imageUrl = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ-N9WA3V5l2qW4SSujiQVMn8ql4zQxSHRduw&s"
      )
    )
  ),
  Restaurant(
    id = 2,
    name = "China Town",
    description = "Los mejores platillos de la gastronomía oriental",
    imageUrl = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSYs8m3xhl34DfWowfAR3A97_QxgfiNN2NP8dLk5ko0cg&s",
    categories = listOf("Asiática", "Rápida"),
    menu = listOf(
      Dish(
        id = 1,
        name = "Pollo a la naranja",
        description = "Trozos de pollo frito cubiertos con salsa de naranja",
        imageUrl = "https://especiasmontero.com/wp-content/uploads/2025/07/Orange-Chicken-500x500.jpg"
      ),
      Dish(
        id = 2,
        name = "Arroz cantones",
        description = "Arroz frito con vegetales y la proteina de elección",
        imageUrl = "https://cdn0.recetasgratis.net/es/posts/4/7/0/arroz_chino_a_la_venezolana_35074_orig.jpg"
      ),
      Dish(
        id = 3,
        name = "Chow mein",
        description = "Fideos salteados con vegetales y la proteina de elección",
        imageUrl = "https://www.cocinadelirante.com/800x600/filters:format(webp):quality(75)/sites/default/files/images/2023/08/comidachinachowmeindepollo.jpg"
      ),
      Dish(
        id = 4,
        name = "Rollos primavera",
        description = "Orden de rollos fritos rellenos de vegetales, acompañados con salsa",
        imageUrl = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRcn5V2uQ8kpO60dUL8xwG8G8iyfNhl_Lqi_g&s"
      )
    )
  ),
  Restaurant(
    id = 3,
    name = "Snowy Ice Cream",
    description = "Helados, Pasteles y bebidas para cualquier ocasión especial",
    imageUrl = "https://cdn.creativefabrica.com/2022/04/17/Ice-Cream-Logo-Graphics-29131587-1.jpg",
    categories = listOf("Postres", "Bebidas", "Rápida"),
    menu = listOf(
      Dish(
        id = 1,
        name = "Cono tradicional",
        description = "Cono con una bola de helado del sabor de elección",
        imageUrl = "https://www.laneveria.com.sv/wp-content/uploads/2024/09/conosyogurt-mango.jpg"
      ),
      Dish(
        id = 2,
        name = "Cono doble",
        description = "Cono con dos bolas de helado del sabor de elección",
        imageUrl = "https://www.laneveria.com.sv/wp-content/uploads/2024/09/conosyogurt-mango.jpg"
      ),
      Dish(
        id = 3,
        name = "Banana Split",
        description = "Banana y tres bolas de helado, con crema batida y toppings",
        imageUrl = "https://www.laneveria.com.sv/wp-content/uploads/2016/08/WEB-SERVIDOS-2019-BANANA-SPLIT2020.png"
      ),
      Dish(
        id = 4,
        name = "Pastel helado",
        description = "Pastel grande con capas de pan y helado, cubierto de crema",
        imageUrl = "https://www.laneveria.com.sv/wp-content/uploads/2021/07/2-porcion-helado.jpg"
      ),
      Dish(
        id = 5,
        name = "Milkshake",
        description = "Bebida a base de leche con helado del sabor de elección",
        imageUrl = "https://bromabakery.com/wp-content/uploads/2016/03/Caramel-Milkshake-3.jpg"
      )
    )
  ),
  Restaurant(
    id = 4,
    name = "Tony's Burgers",
    description = "Hamburguesas, bebidas y entradas hechas con los mejores ingredientes",
    imageUrl = "https://www.shutterstock.com/image-vector/cute-cartoon-hamburger-happy-face-600nw-2699232891.jpg",
    categories = listOf("Hamburguesas", "Bebidas"),
    menu = listOf(
      Dish(
        id = 1,
        name = "BBQ Bacon Burger",
        description = "Hamburguesa con tocino, queso, vegetales y salsa barbacoa",
        imageUrl = "https://www.cnature.es/wp-content/uploads/2021/12/hamburguesa-con-guacamole.jpg"
      ),
      Dish(
        id = 2,
        name = "Classic Cheeseburger",
        description = "Hamburguesa clásica con dos rodajas de queso americano",
        imageUrl = "https://www.cnature.es/wp-content/uploads/2021/12/hamburguesa-con-guacamole.jpg"
      ),
      Dish(
        id = 3,
        name = "Alitas buffalo",
        description = "Orden de alitas de pollo bañadas en salsa buffalo picante",
        imageUrl = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQqW2xZDjxHy13PlI1NR5j0YV8xWexdgFbZEQ&s"
      ),
      Dish(
        id = 4,
        name = "Mozzarella Sticks",
        description = "Orden de tiras de queso mozzarella empanizadas",
        imageUrl = "https://sugarspunrun.com/wp-content/uploads/2021/07/Homemade-Mozzarella-Sticks-Recipe-1-of-1.jpg"
      ),
      Dish(
        id = 5,
        name = "Té helado",
        description = "Vaso de té helado de limón, durazno o frambueza",
        imageUrl = "https://www.divinacocina.es/wp-content/uploads/2015/06/te-helado-1.jpg"
      )
    )
  ),
  Restaurant(
    id = 5,
    name = "Bistro Coffee",
    description = "Bebidas de café, sandwiches y postres horneados diariamente en casa",
    imageUrl = "https://i.pinimg.com/736x/39/3b/b1/393bb1bb15940aea508dd07c5da23917.jpg",
    categories = listOf("Bebidas", "Postres"),
    menu = listOf(
      Dish(
        id = 1,
        name = "Cappuccino",
        description = "Shot de espresso con leche caliente y capa de espuma",
        imageUrl = "https://smallcakesbakery.com/wp-content/uploads/2024/01/capuccino.png"
      ),
      Dish(
        id = 2,
        name = "Mocha Frappe",
        description = "Bebida fría de café con chocolate y crema batida",
        imageUrl = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQHD6s7mn_Jp0bYPr5bLH1RB2rZZ_Dgp4FVIA&s"
      ),
      Dish(
        id = 3,
        name = "Caramel Frappe",
        description = "Bebida fría de café con caramelo y crema batida",
        imageUrl = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQHD6s7mn_Jp0bYPr5bLH1RB2rZZ_Dgp4FVIA&s"
      ),
      Dish(
        id = 4,
        name = "Carrot cake",
        description = "Porción de pastel de zanahoria con glaseado de queso crema",
        imageUrl = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSjxUxoTuNdm14xVtobIndIFQm4u7TYdJEdmg&s"
      ),
      Dish(
        id = 5,
        name = "Club Sandwich",
        description = "Sandwich con jamón de pavo, queso mozzarella y vegetales",
        imageUrl = "https://somethingaboutsandwiches.com/wp-content/uploads/2022/04/ham-sandwich.jpg"
      ),
    )
  ),
  Restaurant(
    id = 6,
    name = "Pupuseria Lupita",
    description = "Las mejores pupusas, bebidas y platillos típicos salvadoreños",
    imageUrl = "https://img.magnific.com/vector-premium/jefa-cocina-plato-mano-icon-vector-logotipo-fondo-transparente-blanco-hotel-restaurante_1119746-136.jpg?semt=ais_hybrid&w=740&q=80",
    categories = listOf("Típica", "Bebidas"),
    menu = listOf(
      Dish(
        id = 1,
        name = "Pupusa de frijol con queso",
        description = "Pupusa de masa de maíz rellena con queso y frijoles fritos",
        imageUrl = "https://www.danceswithknives.com/wp-content/uploads/2021/01/cheesy-pupusa-upclose-square.jpg"
      ),
      Dish(
        id = 2,
        name = "Pupusa revuelta",
        description = "Pupusa de masa de maíz rellena con queso, frijoles fritos y chicharrón",
        imageUrl = "https://www.danceswithknives.com/wp-content/uploads/2021/01/cheesy-pupusa-upclose-square.jpg"
      ),
      Dish(
        id = 3,
        name = "Enchilada",
        description = "Tostada con frijoles fritos, carne, curtido y huevo hervido",
        imageUrl = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSJVcnnjIMShuBPxM8AWPO7XRNsm5yWNaZz9A&s"
      ),
      Dish(
        id = 4,
        name = "Empanada de leche",
        description = "Bolita de masa de plátano rellena con leche poleada",
        imageUrl = "https://lh3.googleusercontent.com/-gsC6B49cA3I/U1g5kkLMxWI/AAAAAAAAEYE/NL8Z2M7Kb_k/s596/empanadas-de-platano.jpg"
      ),
      Dish(
        id = 5,
        name = "Horchata",
        description = "Refrescante vaso de horchata de morro, servida con hielo",
        imageUrl = "https://assets.epicurious.com/photos/57437b888ee131d77c1d689d/1:1/w_2560%2Cc_limit/Horchata.jpg"
      )
    )
  ),
  Restaurant(
    id = 7,
    name = "Tacos Sanchez",
    description = "Tacos, tortas, burritos y otras delicias de la gastronomía mexicana",
    imageUrl = "https://img.magnific.com/vector-premium/logotipo-tacos-es-ilustracion-vectorial-alimentos-mexicanos_911078-6563.jpg?semt=ais_hybrid&w=740&q=80",
    categories = listOf("Mexicana", "Rápida"),
    menu = listOf(
      Dish(
        id = 1,
        name = "Tacos al pastor",
        description = "Orden de tres tacos con carne al pastor, cebolla y cilantro",
        imageUrl = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRkY2LjgzMN3zrzakLYoD7xBAlIvdjv3WMTWg&s"
      ),
      Dish(
        id = 2,
        name = "Tacos de lengua",
        description = "Orden de tres tacos con lengua de res, cebolla y cilantro",
        imageUrl = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRkY2LjgzMN3zrzakLYoD7xBAlIvdjv3WMTWg&s"
      ),
      Dish(
        id = 3,
        name = "Torta de pollo",
        description = "Torta con pollo, frijoles fritos, queso fundido y aguacate fresco",
        imageUrl = "https://bakeitwithlove.com/wp-content/uploads/2022/10/Mexican-Torta-carne-asada-sandwich-sq.jpg"
      ),
      Dish(
        id = 4,
        name = "Burrito al pastor",
        description = "Burrito con carne al pastor, frijoles, arroz, queso, cebolla y aguacate fresco",
        imageUrl = "https://static01.nyt.com/images/2024/01/10/multimedia/AS-Burrito-vzhk/AS-Burrito-vzhk-mediumSquareAt3X.jpg"
      ),
      Dish(
        id = 5,
        name = "Burrito de chorizo",
        description = "Burrito con chorizo, frijoles, arroz, queso, cebolla y aguacate fresco",
        imageUrl = "https://static01.nyt.com/images/2024/01/10/multimedia/AS-Burrito-vzhk/AS-Burrito-vzhk-mediumSquareAt3X.jpg"
      ),
      Dish(
        id = 6,
        name = "Sopa de tortilla",
        description = "Plato de sopa con tortilla, queso, aguacate y cilantro",
        imageUrl = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQRYqg1sD-KIMIteAv6Zl_IhbyxIna75Q72Qg&s"
      )
    )
  ),
  Restaurant(
    id = 8,
    name = "Imperial Sushi",
    description = "Sushi, ramen y otros platillos de la gastronomía japonesa",
    imageUrl = "https://st2.depositphotos.com/2562843/6439/v/450/depositphotos_64399677-stock-illustration-vector-logo-with-sushi.jpg",
    categories = listOf("Asiática"),
    menu = listOf(
      Dish(
        id = 1,
        name = "California Roll",
        description = "Rollo con cangrejo, pepino y aguacate cubierto con ajonjoli",
        imageUrl = "https://www.sonshinekitchen.com/wp-content/uploads/2023/03/crunchy-sushi-roll-recipe-1-500x500.jpg"
      ),
      Dish(
        id = 2,
        name = "Ninja Roll",
        description = "Rollo con camarón, queso crema, pepino y spicy mayo",
        imageUrl = "https://www.sonshinekitchen.com/wp-content/uploads/2023/03/crunchy-sushi-roll-recipe-1-500x500.jpg"
      ),
      Dish(
        id = 3,
        name = "Spicy Ramen",
        description = "Sopa miso picante con cerdo, cebollin, hongos y huevo hervido",
        imageUrl = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQXktv73MTYo8fo4a7KCpsnpRVgyFBK5MePfA&s"
      )
    )
  ),
  Restaurant(
    id = 9,
    name = "Sweet Cakes",
    description = "Pasteles de cumpleaños y postres variados para todas tus celebraciones",
    imageUrl = "https://img.pikbest.com/png-images/cake-logo-vector-graphic-element_1773660.png!sw800",
    categories = listOf("Postres"),
    menu = listOf(
      Dish(
        id = 1,
        name = "Pastel de frutas",
        description = "Pastel grande de vainilla con glaseado cubierto de fruta de temporada",
        imageUrl = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTd5wk-G5D-Te-DyspU0VaFGLj1l-lD2G3oaw&s"
      ),
      Dish(
        id = 2,
        name = "Tiramisu",
        description = "Postre en capas de bizcocho con café, queso mascarpone y cacao en polvo",
        imageUrl = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTtsOSDODotX7HAI9lhkTQZAUG7H2eepMueng&s"
      ),
      Dish(
        id = 3,
        name = "Croissant",
        description = "Pan de masa de hojaldre relleno con crema pastelera",
        imageUrl = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ-6JKmtZP6uXL4KULmiBXBPtVjhphR27UqcQ&s"
      ),
      Dish(
        id = 4,
        name = "Carrot cake",
        description = "Porción de pastel de zanahoria con glaseado de queso crema",
        imageUrl = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSjxUxoTuNdm14xVtobIndIFQm4u7TYdJEdmg&s"
      )
    )
  ),
  Restaurant(
    id = 10,
    name = "Pizza Luigi",
    description = "Pizzas artesanales y otros platillos de comida italiana",
    imageUrl = "https://img.magnific.com/premium-vector/slice-pizza-logo-cartoon-illustration_665569-69.jpg",
    categories = listOf("Italiana", "Pizza"),
    menu = listOf(
      Dish(
        id = 1,
        name = "Pan con ajo",
        description = "Orden de tres panes con ajo y queso mozzarella",
        imageUrl = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTFB0KOIkUQkc-7KTW9I2Xx5pjXT2aLxJ_hnA&s"
      ),
      Dish(
        id = 2,
        name = "Pizza de pepperoni",
        description = "Pizza con salsa de tomate, queso mozzarella y pepperoni",
        imageUrl = "https://www.pizzahut.com.sv/static/media/images/images/jpg/1_18-06-2025-15-35_MD.jpg"
      ),
      Dish(
        id = 3,
        name = "Pasta alfredo",
        description = "Plato de espagueti con salsa alfredo y pollo a la plancha",
        imageUrl = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSgQ5t4UaMh1sbUyYtSnh0K4oJKjuQ7aiO5sw&s"
      ),
      Dish(
        id = 4,
        name = "Pasta marinara",
        description = "Plato de espagueti con salsa de tomate, albondigas y queso parmesano",
        imageUrl = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcT1Syf_gc6-y0tp6spVdHiZrNlHbpjO2TziJw&s"
      )
    )
  ),
  Restaurant(
    id = 11,
    name = "Sivar Sport Bar",
    description = "El mejor lugar para el entretenimiento y buena comida",
    imageUrl = "https://img.magnific.com/vector-gratis/diseno-logotipo-bar-deportivo-diseno-plano_23-2149459060.jpg",
    categories = listOf("Hamburguesas", "Pizza", "Mariscos", "Bebidas"),
    menu = listOf(
      Dish(
        id = 1,
        name = "Classic Cheeseburger",
        description = "Hamburguesa clásica con dos rodajas de queso americano",
        imageUrl = "https://www.cnature.es/wp-content/uploads/2021/12/hamburguesa-con-guacamole.jpg"
      ),
      Dish(
        id = 2,
        name = "Pizza de pepperoni",
        description = "Pizza con salsa de tomate, queso mozzarella y pepperoni",
        imageUrl = "https://www.pizzahut.com.sv/static/media/images/images/jpg/1_18-06-2025-15-35_MD.jpg"
      ),
      Dish(
        id = 3,
        name = "Tacos de pescado",
        description = "Tacos con pescado frito, ensalada de repollo y aguacate",
        imageUrl = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTTOKfonx9TblJUeIx6u_zxZJmcqdGmjwoYdw&s"
      ),
      Dish(
        id = 4,
        name = "Michelada",
        description = "Bebida preparada de cerveza con limón, chile y sal",
        imageUrl = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ-N9WA3V5l2qW4SSujiQVMn8ql4zQxSHRduw&s"
      ),
      Dish(
        id = 5,
        name = "Té helado",
        description = "Vaso de té helado de limón, durazno o frambueza",
        imageUrl = "https://www.divinacocina.es/wp-content/uploads/2015/06/te-helado-1.jpg"
      )
    )
  ),
  Restaurant(
    id = 12,
    name = "Plaza Azteca",
    description = "La mejor comida mexicana de la ciudad",
    imageUrl = "https://i.pinimg.com/474x/7c/fa/25/7cfa2523cc5fac176f1ba630fb5a62fc.jpg",
    categories = listOf("Mexicana", "Bebidas"),
    menu = listOf(
      Dish(
        id = 1,
        name = "Tacos al pastor",
        description = "Orden de tres tacos con carne al pastor, cebolla y cilantro",
        imageUrl = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRkY2LjgzMN3zrzakLYoD7xBAlIvdjv3WMTWg&s"
      ),
      Dish(
        id = 2,
        name = "Tacos de lengua",
        description = "Orden de tres tacos con lengua de res, cebolla y cilantro",
        imageUrl = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRkY2LjgzMN3zrzakLYoD7xBAlIvdjv3WMTWg&s"
      ),
      Dish(
        id = 3,
        name = "Torta de pollo",
        description = "Torta con pollo, frijoles fritos, queso fundido y aguacate fresco",
        imageUrl = "https://bakeitwithlove.com/wp-content/uploads/2022/10/Mexican-Torta-carne-asada-sandwich-sq.jpg"
      ),
      Dish(
        id = 4,
        name = "Burrito al pastor",
        description = "Burrito con carne al pastor, frijoles, arroz, queso, cebolla y aguacate fresco",
        imageUrl = "https://static01.nyt.com/images/2024/01/10/multimedia/AS-Burrito-vzhk/AS-Burrito-vzhk-mediumSquareAt3X.jpg"
      ),
      Dish(
        id = 5,
        name = "Burrito de chorizo",
        description = "Burrito con chorizo, frijoles, arroz, queso, cebolla y aguacate fresco",
        imageUrl = "https://static01.nyt.com/images/2024/01/10/multimedia/AS-Burrito-vzhk/AS-Burrito-vzhk-mediumSquareAt3X.jpg"
      ),
      Dish(
        id = 6,
        name = "Sopa de tortilla",
        description = "Plato de sopa con tortilla, queso, aguacate y cilantro",
        imageUrl = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQRYqg1sD-KIMIteAv6Zl_IhbyxIna75Q72Qg&s"
      )
    )
  )
)