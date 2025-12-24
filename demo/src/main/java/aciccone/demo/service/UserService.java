package aciccone.demo.service;


import aciccone.demo.entities.Role;
import aciccone.demo.entities.User;
import aciccone.demo.exceptions.BadRequestException;
import aciccone.demo.exceptions.NotFoundException;
import aciccone.demo.exceptions.UnauthorizedException;
import aciccone.demo.payloads.UserLoginRequestDTO;
import aciccone.demo.payloads.UserRegisterRequestDTO;
import aciccone.demo.payloads.UserResponseDTO;
import aciccone.demo.payloads.UserUpdateRequestDTO;
import aciccone.demo.repositories.UserRepository;
import jakarta.transaction.Transactional;
import org.aspectj.weaver.NewConstructorTypeMunger;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicReference;
import java.util.stream.Collectors;

@Service
@Transactional
public class UserService
{
  private final UserRepository userRepository;
public UserService(UserRepository userRepository){
    this.userRepository=userRepository;
}


    private UserResponseDTO toResponse (User user){
       return new UserResponseDTO(
               user.getId(),
               user.getName(),
               user.getEmail(),
               user.getRole()
       ) ;
    }

    public UserResponseDTO registerUser(UserRegisterRequestDTO request){
        if(userRepository.findByEmail(request.email()).isPresent()){
            throw new BadRequestException("L'email " + request.email()+ "è già registrata!");
        }

        User user= new User();
        user. setName(request.name());
        user.setEmail(request.email());
        user.setPassword(request.password());
        user.setRole(Role.USER);
        User saved = userRepository.save(user);
        return toResponse(saved);
    }

    //login

    public UserResponseDTO login(UserLoginRequestDTO request){
    User user = userRepository.findByEmail(request.email()).orElseThrow(()-> new UnauthorizedException("Credenziali non valide"));
    if (!user.getPassword().equals(request.password()))
    {throw  new UnauthorizedException("Credezianli non valide");
    }
    return  toResponse(user);
    }

    //trovo utente x id

    public UserResponseDTO findById(Long id){
    User user = userRepository.findById(id).orElseThrow(()-> new NotFoundException("Utente non trovato"));
        return toResponse(user);

    }

    // trova utente x email

    public UserResponseDTO findByEmail(String email){
        User user = userRepository. findByEmail(email).orElseThrow(()-> new NotFoundException("Utente non trovato"));
        return toResponse(user);
}
//trova tutti gli utenti

    public List<UserResponseDTO> dinAll(){
    return userRepository.findAll().stream().map(this::toResponse).collect(Collectors.toList());
    }

    //aggiorno utente

    public UserResponseDTO updateUser(Long id, UserUpdateRequestDTO request){
    User user = userRepository.findById(id).orElseThrow(()-> new NotFoundException("Utente non trovato"));

    if (!user.getEmail().equals(request.email())){
        Optional<User> existingUser = userRepository.findByEmail(request.email());

    }
    }
}


