package se331.lab.rest.security.auth;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import se331.lab.rest.entity.Advisor;

import java.io.IOException;

@RestController
@RequestMapping("/api/v1/auth")
@RequiredArgsConstructor
public class AuthenticationController {

  private final AuthenticationService service;

  @PostMapping("/registerStudent")
  public ResponseEntity<AuthenticationResponse> StudentRegister(
      @RequestBody RegisterRequest request
  ) {
    return ResponseEntity.ok(service.registerStudent(request));
  }
  @PostMapping("/registerAdvisor")
  public ResponseEntity<AuthenticationResponseAdvisor> AdvisorRegister(
          @RequestBody RegisterRequest request
  ) {
    return ResponseEntity.ok(service.registerAdvisor(request));
  }
  @PostMapping("/authenticate")
  public ResponseEntity<AuthenticationResponse> authenticate(
      @RequestBody AuthenticationRequest request
  ) {
    AuthenticationResponse result = service.authenticate(request);
    return ResponseEntity.ok(result);
  }

  @PostMapping("/refresh-token")
  public void refreshToken(
      HttpServletRequest request,
      HttpServletResponse response
  ) throws IOException {
    service.refreshToken(request, response);
  }


}
