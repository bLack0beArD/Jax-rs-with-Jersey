package org.abdessamed.jijel.massanger.massanger.profile;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import model.Profile;

@Path("/profiles")
public class ProfileServices {

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Profile> getProfiles() {
		return ProfileConnector.getProfiles();
	}
	
	@GET
	@Path("/{profileId}")
	@Produces(MediaType.APPLICATION_JSON)
	public Profile getProfile(@PathParam("profileId") int id) {
		return ProfileConnector.getProfile(id);
	}

}
