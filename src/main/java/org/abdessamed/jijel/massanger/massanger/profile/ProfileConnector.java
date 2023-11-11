package org.abdessamed.jijel.massanger.massanger.profile;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.abdessamed.jijel.massanger.massanger.DataBase;

import model.Profile;

public class ProfileConnector {
	private static Map<Integer, Profile> profilesValues = new DataBase().profiles;

	private static void fill() {
		profilesValues = new HashMap<Integer, Profile>();
		profilesValues.put(0, new Profile(0, "ahmed"));
		profilesValues.put(1, new Profile(1, "mouhamed"));

	}

	public static List<Profile> getProfiles() {
		fill();
		List<Profile> profiles = new ArrayList<Profile>();
		profiles.addAll(profilesValues.values());
		return profiles;

	}
	public static Profile getProfile(int id) {
		
		return profilesValues.get(id);
	}

}
