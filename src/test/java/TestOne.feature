Feature: "From" ve "To" giriş alanlarının aynı değeri kabul etmediğini kontrol et

  Scenario: "From" ve "To" giriş alanlarının aynı değeri kabul etmediğini kontrol et
    Given Ben uçuş rezervasyon sayfasındayım
    When From ve To giriş alanlarına aynı değeri girersem
    Then Aynı değerin her iki alanına da girilemediğini belirten bir hata mesajı görmeliyim