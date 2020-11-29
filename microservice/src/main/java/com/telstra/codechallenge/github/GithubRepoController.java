package com.telstra.codechallenge.github;

import java.util.Arrays;
import java.util.List;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class GithubRepoController {

  private GithubRepoService githubRepoService;

  public GithubRepoController(
    GithubRepoService githubRepoService) {
    this.githubRepoService = githubRepoService;
  }

  @RequestMapping(path = "/repo/hottest", method = RequestMethod.GET)

//   public Repos repos(@RequestParam(value = "limit", defaultValue = "5") int limit) {
//     return Arrays.asList(githubRepoService.getRepos()).subList(0, limit);
//   }

  public Repos repos() {
    return githubRepoService.getRepos();
  }

}
