package com.example.toptrumps.toptrumps.components;

import com.example.toptrumps.toptrumps.models.Card;
import com.example.toptrumps.toptrumps.repositories.CardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {
    @Autowired
    CardRepository cardRepository;

    public DataLoader() {

    }

    public void run(ApplicationArguments args) {
        Card brimstone = new Card("Brimstone", 5, 10, 8, 6, 7, "https://static.wikia.nocookie.net/valorant/images/4/4d/Brimstone_icon.png/revision/latest?cb=20201128234311");
        cardRepository.save(brimstone);

        Card viper = new Card("Viper", 5, 15, 13, 5, 6, "https://static.wikia.nocookie.net/valorant/images/5/5f/Viper_icon.png/revision/latest?cb=20201128234408");
        cardRepository.save(viper);

        Card omen = new Card("Omen", 8, 8, 8, 7, 2, "https://static.wikia.nocookie.net/valorant/images/b/b0/Omen_icon.png/revision/latest?cb=20201128234318");
        cardRepository.save(omen);

        Card killjoy = new Card("Killjoy", 4, 14, 15, 3, 8, "https://static.wikia.nocookie.net/valorant/images/1/15/Killjoy_icon.png/revision/latest?cb=20200805002141");
        cardRepository.save(killjoy);

        Card cypher = new Card("Cypher", 2, 9, 14, 2, 4, "https://static.wikia.nocookie.net/valorant/images/8/88/Cypher_icon.png/revision/latest?cb=20201128234211");
        cardRepository.save(cypher);

        Card sova = new Card("Sova", 6, 5, 5, 15, 14, "https://static.wikia.nocookie.net/valorant/images/4/49/Sova_icon.png/revision/latest?cb=20201128234221");
        cardRepository.save(sova);

        Card sage = new Card("Sage", 1, 1, 1, 1, 4, "https://i.imgur.com/1kwK0VS.png");
        cardRepository.save(sage);

        Card phoenix = new Card("Phoenix", 12, 5, 4, 8, 7, "https://static.wikia.nocookie.net/valorant/images/4/48/Phoenix_VALORANT_Portrait.png/revision/latest?cb=20220412173559");
        cardRepository.save(phoenix);

        Card jett = new Card("Jett", 15, 7, 4, 8, 10, "https://static.wikia.nocookie.net/valorant/images/7/7a/Jett_VALORANT_Portrait.png/revision/latest?cb=20220412173559");
        cardRepository.save(jett);

        Card reyna = new Card("Reyna", 9, 3, 3, 7, 1, "https://static.wikia.nocookie.net/valorant/images/c/c1/Reyna_VALORANT_Portrait.png/revision/latest?cb=20220412173559");
        cardRepository.save(reyna);

        Card raze = new Card("Raze", 14, 4, 7, 10, 15, "https://static.wikia.nocookie.net/valorant/images/6/6a/Raze_VALORANT_Portrait.png/revision/latest?cb=20220301162855");
        cardRepository.save(raze);

        Card breach = new Card("Breach", 9, 8, 7, 13, 13, "https://static.wikia.nocookie.net/valorant/images/f/f7/Breach_VALORANT_Portrait.png/revision/latest?cb=20220323040939");
        cardRepository.save(breach);

        Card skye = new Card("Skye", 10, 8, 7, 11, 7, "https://static.wikia.nocookie.net/valorant/images/a/a4/Skye_VALORANT_Portrait.png/revision/latest?cb=20220323040940");
        cardRepository.save(skye);

        Card yoru = new Card("Yoru", 11, 6, 5, 7, 3, "https://static.wikia.nocookie.net/valorant/images/a/ab/Yoru_VALORANT_Portrait.png/revision/latest?cb=20220412173559");
        cardRepository.save(yoru);

        Card astra = new Card("Astra", 2, 12, 10, 3, 4, "https://static.wikia.nocookie.net/valorant/images/4/4d/Astra_VALORANT_Portrait.png/revision/latest?cb=20220412173557");
        cardRepository.save(astra);

        Card kayo = new Card("Kayo", 8, 7, 9, 11, 8, "https://static.wikia.nocookie.net/valorant/images/5/57/KAYO_VALORANT_Portrait.png/revision/latest?cb=20220412173559");
        cardRepository.save(kayo);

        Card chamber = new Card("Chamber", 4, 4, 6, 5, 7, "https://static.wikia.nocookie.net/valorant/images/9/9c/Chamber_VALORANT_Portrait.png/revision/latest?cb=20220301162855");
        cardRepository.save(chamber);

        Card neon = new Card("Neon", 10, 2, 2, 9, 7, "https://static.wikia.nocookie.net/valorant/images/0/01/Neon_VALORANT_Portrait.png/revision/latest?cb=20220325004846");
        cardRepository.save(neon);

        Card fade = new Card("Fade", 7, 7, 5, 14, 6, "https://static.wikia.nocookie.net/valorant/images/a/a6/Fade_icon.png/revision/latest?cb=20220525095157");
        cardRepository.save(fade);
    }
}

