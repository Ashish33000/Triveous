package com.triveous.service;

import org.springframework.stereotype.Service;

@Service
public class DynamicService {
//	 private final String dynamicsApiUrl = "https://api.dynamics365.com"; // Replace with your Dynamics 365 API URL
//	    private final String resourceUrl = "https://api.dynamics365.com"; // Replace with the Dynamics 365 resource URL
//	    private final String clientId = "your-client-id"; // Replace with your OAuth2 client ID
//	    private final String clientSecret = "your-client-secret"; // Replace with your OAuth2 client secret
//
//	    @Autowired
//	    private OAuth2AuthorizedClientService authorizedClientService;
//
//	    public List<AuthRequest> getAccounts() {
//	        // Obtain an OAuth2 access token
//	        OAuth2AuthorizedClient authorizedClient = authorizedClientService.loadAuthorizedClient("dynamics");
//
//	        if (authorizedClient == null) {
//	            throw new RuntimeException("OAuth2 authorized client not found.");
//	        }
//
//	        String accessToken = authorizedClient.getAccessToken().getTokenValue();
//	        // Set up headers with the access token
//	        HttpHeaders headers = new HttpHeaders(null);
//	        headers.set("Authorization", "Bearer " + accessToken);
//
//	        // Create a RestTemplate for making API requests
//	        RestTemplate restTemplate = new RestTemplate();
//	        HttpEntity<String> entity = new HttpEntity<>(headers);
//
//	        // Define the API endpoint for retrieving accounts
//	        String accountApiUrl = dynamicsApiUrl + "/api/accounts"; // Replace with the actual endpoint
//
//	        // Make the API request and deserialize the response into a List<Account>
//	        ResponseEntity<AuthRequest[]> response = restTemplate.exchange(
//	            accountApiUrl,
//	            HttpMethod.GET,
//	            entity,
//	            AuthRequest[].class
//	        );
//
//	        if (response.getStatusCode() == HttpStatus.OK) {
//	            return Arrays.asList(response.getBody());
//	        } else {
//	            // Handle error here, for example, log the error or throw an exception.
//	            return Collections.emptyList(); // Return an empty list on error.
//	        }
	    //}


}
