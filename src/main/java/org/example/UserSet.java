package org.example;

import java.util.*;

public class UserSet {
    public Set<String> users;

    public UserSet() {
        this.users = new HashSet<>();
    }

    public boolean addUser(String username) {
        if (username == null || username.trim().isEmpty()) {
            throw new IllegalArgumentException("Cannot be empty.");
        }
        return users.add(username);
    }

    public boolean removeUser(String username) {
        return users.remove(username);
    }

    public boolean containsUser(String username) {
        return users.contains(username);
    }

    public int getUserCount() {
        return users.size();
    }

    public List<String> getUsersWithPrefix(String prefix) {
        if (prefix == null) {
            throw new IllegalArgumentException("Prefix cannot be null.");
        }

        List<String> result = new ArrayList<>();
        for (String user : users) {
            if (user.startsWith(prefix)) {
                result.add(user);
            }
        }
        return result;
    }

    public boolean areAllUsersUnique(String[] arr) {
        if (arr == null) {
            throw new IllegalArgumentException("Input array cannot be null.");
        }
        Set<String> seen = new HashSet<>();
        for (String user : arr) {
            if (!seen.add(user)) {
                return false;
            }
        }
        return true;
    }
}
