# TwitterAPI
Twitter API Integration with SpringBoot
This project is a SpringBoot Java application that integrates with the Twitter API and exposes two RESTful APIs:





Search Tweet user
Get tweets of the selected user
The application uses header-based authentication with a random client ID and client secret.




Getting Started
Prerequisites
Java 11 or higher
Maven
Twitter Developer Account
Installation
Clone the repository:
git clone https://github.com/your-username/twitter-api-integration.git
Navigate to the project directory:
cd twitter-api-integration
Create a Twitter Developer account and obtain the necessary credentials:
Consumer Key (API Key)
Consumer Secret (API Secret Key)
Access Token
Access Token Secret
Update the application.properties file with your Twitter API credentials:
Build the project:
Usage
The application exposes two RESTful APIs:



Search Tweet user
Endpoint: GET /api/v1/twitter/search-user
Headers:
X-ClientId: <random-client-id>
X-ClientSecret: <random-client-secret>
Request Parameters:
q: The search query for the user
Response: A JSON object containing the search results for the user.
Get tweets of the selected user
Endpoint: GET /api/v1/twitter/user-tweets
Headers:
X-ClientId: <random-client-id>
X-ClientSecret: <random-client-secret>
Request Parameters:
screenName: The screen name of the user
Response: A JSON object containing the recent tweets of the user.
Make sure to include the X-ClientId and X-ClientSecret headers in your requests. The values for these headers can be generated randomly.
