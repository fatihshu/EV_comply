Feature: EV

  @wip
  Scenario:
    Given user navigates to "https://www.ev-comply.com"
    Then the user can see "installations Message" is displayed on the page
    And the user can see Register interest Button
    And the user can see Watch Our Intro video
    And the user can see following links
      | About             |
      | Pods & Blogs      |
      | Partners          |
      | Testimonials      |
      | EVC Network       |
      | Careers           |
      | Sign-in           |
      | Register interest |
    Then the user should be the page and click "Login "
    Then the user should verify that the page loads successfully
    Then the user can see the following mobile apps
      | Apple Store  |
      | Google Store |
    Then the user can see following options
      | Privacy policy       |
      | Terms and conditions |





