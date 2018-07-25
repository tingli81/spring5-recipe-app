package guru.springframework.spring5recipeapp.models;

import javax.persistence.*;

//makes object an entity with jpa
@Entity
public class Notes {

    //create id
    @Id
    //specifies strategy to get the id from the database
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //one to one relationship with recipe object, but no specification on ownership, i.e. if we delete notes recipe still remains
    @OneToOne
    private Recipe recipe;

    //large object storage
    @Lob
    private String recipeNotes;


    //getters and setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Recipe getRecipe() {
        return recipe;
    }

    public void setRecipe(Recipe recipe) {
        this.recipe = recipe;
    }

    public String getRecipeNotes() {
        return recipeNotes;
    }

    public void setRecipeNotes(String recipeNotes) {
        this.recipeNotes = recipeNotes;
    }
}
