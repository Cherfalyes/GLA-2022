class Personne:
    def __init__(self, nom, prénom, age, hôtels, réservations):
        self.nom = nom
        self.prénom = prénom
        self.age = age
        self.hôtels = hôtels
        self.réservation = réservations

class Hôtel:
    def __init__(self, adresse, nbPièces, catégorie, personnels, chambres, personnes):
        self.adresse = adresse
        self.nbPièces = nbPièces
        self.catégorie = catégorie
        self.personnels = personnels
        self.chambres = chambres
        self.personnes = personnes
        pass
