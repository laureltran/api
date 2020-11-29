package com.telstra.codechallenge.github;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class GithubRepoService {

  @Value("${github.base.url}")
  private String githubBaseUrl;

  private RestTemplate restTemplate;

  public GithubRepoService(RestTemplate restTemplate) {
    this.restTemplate = restTemplate;
  }

  /**
   * Returns an array of hottest repos. Taken from https://api.github.com/search/repositories/.
   *
   * @return - a repo array
   */
  public Repos getRepos() {
    return restTemplate.getForObject(githubBaseUrl + "/search/repositories?q=data", Repos.class);
  }

}
