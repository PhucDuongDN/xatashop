package com.xata.shop.utils;


import java.util.List;
 
import com.xata.shop.entity.AppUser;
import com.xata.shop.social.SocialUserDetailsImpl;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.social.security.SocialUserDetails;
 
public class SecurityUtil {
 
    // Auto Login.
    public static void logInUser(AppUser user, List<String> roleNames) {
 
        SocialUserDetails userDetails = new SocialUserDetailsImpl(user, roleNames);
 
        Authentication authentication = new UsernamePasswordAuthenticationToken(userDetails, null,
                userDetails.getAuthorities());
        SecurityContextHolder.getContext().setAuthentication(authentication);
    }
 
}