package imagesharingplatform.userservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import imagesharingplatform.userservice.entity.User;

public interface UserRepository extends MongoRepository<User, String> {
}
