 # Use the official WebSphere Liberty base image
FROM websphere-liberty:latest


# Copy the WAR file to the Liberty server
COPY javawebapp.war /config/apps/



# Copy server.xml configuration (optional)
COPY server.xml /config/server.xml

# Expose ports 9080 (HTTP) and 9443 (HTTPS)
EXPOSE 9080


CMD ["server", "run", "defaultServer"]



