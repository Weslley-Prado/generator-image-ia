package infrastructure.repositories;

import domain.models.ProfilePhoto;
import domain.repositories.ProfilePhotoRepository;
import jakarta.enterprise.context.ApplicationScoped;


@ApplicationScoped
public class HIbernateProfilePhotoRepository implements ProfilePhotoRepository {
    @Override
    public void save(String customerId, ProfilePhoto profilePhoto) {

    }
}
