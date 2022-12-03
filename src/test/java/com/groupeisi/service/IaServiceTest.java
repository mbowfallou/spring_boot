package com.groupeisi.service;

import com.groupeisi.dto.Ia;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(SpringRunner.class)
@SpringBootTest
class IaServiceTest {
    @Autowired
    private IaService iaService;

    @Test
    void getIas() {
        int taille = iaService.getIas().size();

        Assertions.assertEquals(1, taille);
    }

    @Test
    void getIa() {
        Ia ia = new Ia();
        ia.setId(1);
        ia.setNom("IA Thies");

        Ia ia_save = iaService.getIa(1);

        Assertions.assertEquals(ia.getNom(), ia_save.getNom());
    }

    @Test
    void getIaByName() {
        Ia ia = new Ia();
        ia.setId(1);
        ia.setNom("IA Thies");

        Ia ia_save = iaService.getIaByName("IA Thies");

        Assertions.assertEquals(ia.getNom(), ia_save.getNom());
    }

    @Test
    void createIa() {
        Ia ia = new Ia();
        ia.setNom("IA Thies");

        Ia ia_save = iaService.createIa(ia);

        Assertions.assertNotNull(ia_save);
    }

    @Test
    void updateIa() {
        Ia ia = new Ia();
        ia.setNom("IA Diourbel");

        Ia ia_update = iaService.updateIa(1, ia);

        Assertions.assertEquals(ia.getNom(), ia_update.getNom());
    }

    @Test
    void deleteIa() {
        iaService.deleteIa(1);
        Assertions.assertTrue(true);
    }
}