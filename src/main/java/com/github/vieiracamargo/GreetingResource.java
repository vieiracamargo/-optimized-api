package com.github.vieiracamargo;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

import java.util.HashMap;
import java.util.Map;

@Path("/settings")
public class GreetingResource {

    private Map<String, Preset> gameSettings = new HashMap<>();

    @GET
    @Path("/{gameTitle}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response hello(@PathParam("gameTitle") String gameTitle) {
        Preset gowRagnarok = Preset.builder()
                .texture(Level.HIGH)
                .models(Level.HIGH)
                .anisotropicFilter(Level.ULTRA)
                .lighting(Level.MEDIUM)
                .shadows(Level.MEDIUM)
                .reflections(Level.MEDIUM)
                .atmospherics(Level.HIGH)
                .ambientOclusion(Level.ULTRA)
                .tessellation(Level.MEDIUM)
                .author("BenchmarKing")
                .build();


        gameSettings.put("God of War Ragnarok", gowRagnarok);
        Preset preset = gameSettings.get(gameTitle);
        return Response.ok(preset).build();
    }
}
