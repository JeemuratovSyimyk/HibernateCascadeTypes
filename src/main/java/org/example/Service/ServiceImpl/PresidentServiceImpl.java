package org.example.Service.ServiceImpl;

import org.example.Entity.President;
import org.example.Service.PresidentService;
import org.example.repository.PresidentRepository;
import org.example.repository.repositoryImpl.PresidentPepositoryImpl;

public class PresidentServiceImpl implements PresidentService {
 PresidentRepository presidentRepository = new PresidentPepositoryImpl();
    @Override
    public void savePresident(President president) {
        presidentRepository.savePresident(president);
    }

    @Override
    public void deletePresident(Long id) {
        presidentRepository.deletePresident(id);
    }
}
