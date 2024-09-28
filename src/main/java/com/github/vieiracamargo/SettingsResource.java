package com.github.vieiracamargo;

import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/settings")
public class SettingsResource {

    @Inject
    GameRepository gameRepository;

    @GET
    @Path("/{gameTitle}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response optimizedSetting(@PathParam("gameTitle") String gameTitle) {
        Preset preset = gameRepository.findByTitleOptional(gameTitle)
                .orElseThrow(NotFoundException::new);

        return Response.ok(preset).build();
    }
}
