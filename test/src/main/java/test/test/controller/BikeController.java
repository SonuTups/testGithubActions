package test.test.controller;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import test.test.model.Bikes;
import test.test.service.BikeService;

import java.awt.print.Book;
import java.util.List;
@RestController("/master")   //http:localhost:8080//master/
@CrossOrigin
public class BikeController {
    @Autowired
    private BikeService bikeService;
    /**
     * Handles the HTTP POST request to add a new bike.
     *
     * @param bike The bike object to be saved, passed in the request body.
     * @return The saved bike object.
     */


    @Operation(summary = "save a bike",description = "This is endpoint to save bike")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Bike saved",
                    content = { @Content(mediaType = "application/json",
                            schema = @Schema(implementation = Bikes.class)) }),
            @ApiResponse(responseCode = "200", description = "Bike saved",
                    content = { @Content(mediaType = "application/xml",
                            schema = @Schema(implementation = Bikes.class)) }),
            @ApiResponse(responseCode = "400", description = "Invalid data supplied",
                    content = @Content),
            @ApiResponse(responseCode = "404", description = "soemething went wrong",
                    content = @Content) })
    @PostMapping(value = "/addBike", consumes = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE},
            produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
    public Bikes saveBike(@RequestBody Bikes bike) {
        // Your logic to save the bike
        return bikeService.saveBike(bike);
    }

    /**
     * Handles the GET request to retrieve all bikes.
     *
     * @return A list of all bikes.
     */


    @Operation(summary = "Get all bikes",description = "This endpoint gives all bikes")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "returning all  bikes",
                    content = { @Content(mediaType = "application/json",
                            schema = @Schema(implementation = Book.class)) }),
            @ApiResponse(responseCode = "400", description = "something went wrong",
                    content = @Content),
            @ApiResponse(responseCode = "404", description = "something went wrong",
                    content = @Content) })
    @GetMapping("/getAll")
    public List<Bikes> getAllBikes(){
        return bikeService.getAllBikes();
    }}