Feature: Uçuş Sayısı Kontrolü

  Background:
    Given Ben uçuş rezervasyon sayfasındayım

  Scenario: "Found X items" yazısındaki X sayısı ile listelenen uçuş sayısının aynı olduğunu test et
    When "From: Istanbul", "To: Los Angeles" seçeneklerini seçersem
    Then "Found X items" yazısındaki X sayısı ile listelenen uçuş sayısının aynı olduğunu kontrol etmeliyim
