import React, { useState } from "react";
import { Grid, Select, MenuItem, FormControl, InputLabel } from "@mui/material";
import { CardMedia } from "@mui/material";


const Category = () => {
  const [selectedCategory, setSelectedCategory] = useState("");
  const [selectedSubcategory, setSelectedSubcategory] = useState("");

  const handleCategoryChange = (event) => {
    setSelectedCategory(event.target.value);
    setSelectedSubcategory(""); // Reset subcategory when changing category
  };

  const handleSubcategoryChange = (event) => {
    setSelectedSubcategory(event.target.value);
  };

  const categories = ["Novels", "History", "Science", "Maths", "English", "Translations"];
  const subcategories = {
    Novels: ["Comedy", "Tragedy", "Love"],
    // Add more subcategories for other categories
  };

  const categoryImages = {
    Novels: "sixth.jpg",
    History: "sixth.jpg",
    Science: "sixth.jpg",
    // Add more categories and their image URLs
  };

  return (
    <Grid container justifyContent='center'>
      <Grid item sm={10}>
        <h1>Category Page</h1>
        <hr />

        {/* Category Dropdown */}
        <FormControl fullWidth style={{ marginBottom: "20px" }}>
          <InputLabel>Category</InputLabel>
          <br />
          <Select value={selectedCategory} onChange={handleCategoryChange}>
            {categories.map((category, index) => (
              <MenuItem key={index} value={category}>
                {category}
              </MenuItem>
            ))}
          </Select>
        </FormControl>

        {/* Subcategory Dropdown */}
        {selectedCategory && subcategories[selectedCategory] && (
          <FormControl fullWidth style={{ marginBottom: "20px" }}>
            <InputLabel>Subcategory</InputLabel>
            <Select value={selectedSubcategory} onChange={handleSubcategoryChange}>
              {subcategories[selectedCategory].map((subcategory, index) => (
                <MenuItem key={index} value={subcategory}>
                  {subcategory}
                </MenuItem>
              ))}
            </Select>
          </FormControl>
        )}

        {/* Display Image */}
        {selectedCategory && (
          <CardMedia
            component="img"
            alt={selectedCategory}
            height="15000px"
            image={categoryImages[selectedCategory]}
            sx={{ margin: "100px auto", display: "categoryImages" }}
          />
        )}
      </Grid>
    </Grid>
  );
};

export default Category;
