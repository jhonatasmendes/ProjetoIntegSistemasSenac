-- MySQL dump 10.13  Distrib 8.0.19, for Win64 (x86_64)
--
-- Host: localhost    Database: projetointegradordesistema
-- ------------------------------------------------------
-- Server version	8.0.35

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `administrador`
--

DROP TABLE IF EXISTS `administrador`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `administrador` (
  `id` int NOT NULL AUTO_INCREMENT,
  `nome` varchar(100) NOT NULL,
  `usuario` varchar(100) NOT NULL,
  `senha` varchar(100) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `administrador`
--

LOCK TABLES `administrador` WRITE;
/*!40000 ALTER TABLE `administrador` DISABLE KEYS */;
INSERT INTO `administrador` VALUES (0,'admin','a','1');
/*!40000 ALTER TABLE `administrador` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `categoria`
--

DROP TABLE IF EXISTS `categoria`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `categoria` (
  `id` int NOT NULL AUTO_INCREMENT,
  `nome` varchar(100) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=25 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `categoria`
--

LOCK TABLES `categoria` WRITE;
/*!40000 ALTER TABLE `categoria` DISABLE KEYS */;
INSERT INTO `categoria` VALUES (1,'Anime'),(2,'Aplicativo'),(3,'Artigo'),(4,'Blog'),(5,'Curso'),(6,'Desenho Animado'),(7,'Documentário'),(8,'Evento ao vivo'),(9,'Evento esportivo'),(10,'Filme'),(11,'História em Quadrinhos'),(12,'Jogo de vídeo'),(13,'Livro'),(14,'Música'),(15,'Podcast'),(16,'Podcast de Entrevista'),(17,'Programa de TV'),(18,'Reality Show'),(19,'Rede social'),(20,'Revista'),(21,'Série'),(22,'Teatro'),(23,'Tutorial Online'),(24,'Webcomic');
/*!40000 ALTER TABLE `categoria` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `cliente`
--

DROP TABLE IF EXISTS `cliente`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `cliente` (
  `id` int NOT NULL AUTO_INCREMENT,
  `nome` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `usuario` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `senha` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `id_vendedor` int DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `cliente_vendedor_FK` (`id_vendedor`),
  CONSTRAINT `cliente_vendedor_FK` FOREIGN KEY (`id_vendedor`) REFERENCES `vendedor` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=201 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cliente`
--

LOCK TABLES `cliente` WRITE;
/*!40000 ALTER TABLE `cliente` DISABLE KEYS */;
INSERT INTO `cliente` VALUES (1,'Alice Silva','asilva','senha123',17),(2,'Bruno Souza','bsouza','senha456',34),(3,'Carla Oliveira','coliveira','senha789',25),(4,'Daniel Costa','dcosta','senha321',9),(5,'Elaine Santos','esantos','senha654',47),(6,'Fernando Almeida','falmeida','senha987',3),(7,'Gabriela Lima','glima','senha111',50),(8,'Henrique Mendes','hmendes','senha222',8),(9,'Isabela Rodrigues','irodrigues','senha333',19),(10,'Júlio Martins','jmartins','senha444',14),(11,'Karen Carvalho','kcarvalho','senha555',45),(12,'Lucas Pereira','lpereira','senha666',22),(13,'Mariana Araújo','maraujo','senha777',30),(14,'Nathalia Ferreira','nferreira','senha888',41),(15,'Otávio Ribeiro','oribeiro','senha999',18),(16,'Patrícia Moreira','pmoreira','senha101',7),(17,'Quintino Freitas','qfreitas','senha102',32),(18,'Renato Nogueira','rnogueira','senha103',6),(19,'Sabrina Barros','sbarros','senha104',24),(20,'Tatiana Gomes','tgomes','senha105',1),(21,'Ubirajara Batista','ubatista','senha106',13),(22,'Vanessa Rocha','vrocha','senha107',11),(23,'Wellington Dias','wdias','senha108',26),(24,'Ximena Teixeira','xteixeira','senha109',38),(25,'Yasmin Monteiro','ymonteiro','senha110',29),(26,'Zuleica Pinto','zpinto','senha111',4),(27,'Adriana Marques','amarques','senha112',39),(28,'Bruno Vieira','bvieira','senha113',23),(29,'Camila Almeida','calmeida','senha114',48),(30,'Douglas Cunha','dcunha','senha115',21),(31,'Elisa Nunes','enunes','senha116',10),(32,'Fábio Lopes','flopes','senha117',15),(33,'Giovana Braga','gbraga','senha118',46),(34,'Hugo Rezende','hrezende','senha119',33),(35,'Ingrid Castro','icastro','senha120',27),(36,'João Pedro','jpedro','senha121',49),(37,'Kleber Silva','ksilva','senha122',2),(38,'Larissa Duarte','lduarte','senha123',16),(39,'Marcelo Fernandes','mfernandes','senha124',12),(40,'Natália Mendes','nmendes','senha125',44),(41,'Otávia Farias','ofarias','senha126',5),(42,'Paulo Henrique','phenrique','senha127',28),(43,'Quésia Silva','qsilva','senha128',35),(44,'Roberta Almeida','ralmeida','senha129',40),(45,'Sérgio Araújo','saraujo','senha130',20),(46,'Tereza Moura','tmoura','senha131',36),(47,'Ursula Dias','udias','senha132',31),(48,'Vitor Freitas','vfreitas','senha133',37),(49,'Wesley Costa','wcosta','senha134',43),(50,'Xuxa Rodrigues','xrodrigues','senha135',42),(51,'Yago Barros','ybarros','senha136',30),(52,'Zilda Almeida','zalmeida','senha137',1),(53,'Alexandre Nunes','anunes','senha138',19),(54,'Brenda Souza','bsouza','senha139',29),(55,'Carlos Menezes','cmenezes','senha140',34),(56,'Débora Santos','dsantos','senha141',17),(57,'Eduardo Carvalho','ecarvalho','senha142',22),(58,'Fabiana Ribeiro','fribeiro','senha143',47),(59,'Guilherme Costa','gcosta','senha144',3),(60,'Helena Lima','hlima','senha145',50),(61,'Igor Ferreira','iferreira','senha146',11),(62,'Joana Moreira','jmoreira','senha147',38),(63,'Kaique Silva','ksilva','senha148',7),(64,'Lívia Teixeira','lteixeira','senha149',25),(65,'Mateus Pereira','mpereira','senha150',14),(66,'Nina Duarte','nduarte','senha151',41),(67,'Orlando Araújo','oaraujo','senha152',18),(68,'Priscila Martins','pmartins','senha153',10),(69,'Quirino Barbosa','qbarbosa','senha154',9),(70,'Rafael Fernandes','rfernandes','senha155',45),(71,'Sônia Farias','sfarias','senha156',30),(72,'Tiago Lopes','tlopes','senha157',35),(73,'Úrsula Almeida','ualmeida','senha158',4),(74,'Vanessa Braga','vbraga','senha159',33),(75,'William Freitas','wfreitas','senha160',12),(76,'Xavier Rocha','xrocha','senha161',6),(77,'Yasmin Ferreira','yferreira','senha162',28),(78,'Zeca Fernandes','zfernandes','senha163',2),(79,'Amanda Lima','alima','senha164',16),(80,'Bruno Carvalho','bcarvalho','senha165',44),(81,'Cíntia Ribeiro','cribeiro','senha166',5),(82,'Diego Mendes','dmendes','senha167',32),(83,'Eduarda Souza','esouza','senha168',49),(84,'Fernanda Nogueira','fnogueira','senha169',27),(85,'Gustavo Lima','glima','senha170',1),(86,'Heloísa Farias','hfarias','senha171',19),(87,'Igor Oliveira','ioliveira','senha172',23),(88,'Júlia Mendes','jmendes','senha173',40),(89,'Kleber Souza','ksouza','senha174',15),(90,'Larissa Pereira','lpereira','senha175',21),(91,'Mariana Costa','mcosta','senha176',11),(92,'Natália Silva','nsilva','senha177',26),(93,'Orlando Freitas','ofreitas','senha178',38),(94,'Priscila Moreira','pmoreira','senha179',34),(95,'Rafael Pereira','rpereira','senha180',50),(96,'Sílvia Ribeiro','sribeiro','senha181',46),(97,'Tiago Fernandes','tfernandes','senha182',39),(98,'Úrsula Nunes','ununes','senha183',25),(99,'Vitor Silva','vsilva','senha184',7),(100,'Wesley Lima','wlima','senha185',29),(101,'Xênia Martins','xmartins','senha186',45),(102,'Yuri Duarte','yduarte','senha187',14),(103,'Zilda Freitas','zfreitas','senha188',13),(104,'Alan Souza','asouza','senha189',33),(105,'Beatriz Costa','bcosta','senha190',20),(106,'Carlos Nogueira','cnogueira','senha191',43),(107,'Daniela Mendes','dmendes','senha192',8),(108,'Eduardo Silva','esilva','senha193',9),(109,'Fátima Ribeiro','fribeiro','senha194',31),(110,'Guilherme Araújo','garaujo','senha195',37),(111,'Helena Pereira','hpereira','senha196',18),(112,'Igor Souza','isouza','senha197',22),(113,'Jéssica Carvalho','jcarvalho','senha198',28),(114,'Kleber Mendes','kmendes','senha199',3),(115,'Lorena Costa','lcosta','senha200',19),(116,'Marcos Silva','msilva','senha201',50),(117,'Natália Nunes','nnunes','senha202',44),(118,'Oscar Ribeiro','oribeiro','senha203',27),(119,'Paula Teixeira','pteixeira','senha204',1),(120,'Quirino Freitas','qfreitas','senha205',4),(121,'Renata Nogueira','rnogueira','senha206',17),(122,'Simone Lima','slima','senha207',29),(123,'Tadeu Costa','tcosta','senha208',2),(124,'Úrsula Mendes','umendes','senha209',35),(125,'Vinícius Souza','vsouza','senha210',5),(126,'William Silva','wsilva','senha211',13),(127,'Ximena Nunes','xnunes','senha212',14),(128,'Yasmin Carvalho','ycarvalho','senha213',32),(129,'Zilda Santos','zsantos','senha214',11),(130,'André Nogueira','anogueira','senha215',24),(131,'Bárbara Lima','blima','senha216',40),(132,'Carlos Silva','csilva','senha217',41),(133,'Débora Souza','dsouza','senha218',49),(134,'Elias Mendes','emendes','senha219',43),(135,'Fernanda Souza','fsouza','senha220',10),(136,'Giovanna Oliveira','goliveira','senha221',8),(137,'Heloísa Silva','hsilva','senha222',50),(138,'Igor Teixeira','iteixeira','senha223',30),(139,'João Nogueira','jnogueira','senha224',37),(140,'Kaique Lima','klima','senha225',21),(141,'Livia Souza','lsouza','senha226',6),(142,'Marcos Teixeira','mteixeira','senha227',12),(143,'Natália Carvalho','ncarvalho','senha228',23),(144,'Otávio Silva','osilva','senha229',20),(145,'Paula Pereira','ppereira','senha230',27),(146,'Quésia Nunes','qnunes','senha231',35),(147,'Roberto Souza','rsouza','senha232',46),(148,'Simone Carvalho','scarvalho','senha233',2),(149,'Tiago Mendes','tmendes','senha234',26),(150,'Úrsula Souza','usouza','senha235',9),(151,'Vinícius Silva','vsilva','senha236',48),(152,'Wellington Nunes','wnunes','senha237',19),(153,'Xuxa Teixeira','xteixeira','senha238',45),(154,'Yuri Lima','ylima','senha239',39),(155,'Zilda Teixeira','zteixeira','senha240',16),(156,'Alan Souza','asouza','senha241',7),(157,'Bárbara Nunes','bnunes','senha242',33),(158,'Carlos Teixeira','cteixeira','senha243',47),(159,'Débora Mendes','dmendes','senha244',13),(160,'Eduardo Nogueira','enogueira','senha245',22),(161,'Fernanda Lima','flima','senha246',15),(162,'Guilherme Silva','gsilva','senha247',29),(163,'Helena Teixeira','hteixeira','senha248',36),(164,'Igor Nunes','inunes','senha249',28),(165,'Júlio Lima','jlima','senha250',31),(166,'Kaique Nunes','knunes','senha251',38),(167,'Livia Teixeira','lteixeira','senha252',20),(168,'Mariana Lima','mlima','senha253',40),(169,'Natália Nunes','nnunes','senha254',21),(170,'Orlando Souza','osouza','senha255',34),(171,'Priscila Teixeira','pteixeira','senha256',11),(172,'Quirino Souza','qsouza','senha257',18),(173,'Renata Lima','rlima','senha258',9),(174,'Simone Teixeira','steixeira','senha259',30),(175,'Tiago Nunes','tnunes','senha260',35),(176,'Úrsula Lima','ulima','senha261',46),(177,'Vinícius Nogueira','vnogueira','senha262',42),(178,'Wesley Silva','wsilva','senha263',25),(179,'Xênia Nogueira','xnogueira','senha264',3),(180,'Yasmin Teixeira','yteixeira','senha265',17),(181,'Zilda Lima','zlima','senha266',6),(182,'Alex Nunes','anunes','senha267',24),(183,'Bárbara Teixeira','bteixeira','senha268',50),(184,'Carlos Nunes','cnunes','senha269',44),(185,'Débora Lima','dlima','senha270',37),(186,'Eduardo Souza','esouza','senha271',10),(187,'Fernanda Nunes','fnunes','senha272',49),(188,'Giovanna Teixeira','gteixeira','senha273',43),(189,'Heloísa Lima','hlima','senha274',2),(190,'Igor Teixeira','iteixeira','senha275',48),(191,'Jéssica Souza','jsouza','senha276',16),(192,'Kaique Lima','klima','senha277',41),(193,'Livia Nogueira','lnogueira','senha278',31),(194,'Marcos Nunes','mnunes','senha279',8),(195,'Natália Teixeira','nteixeira','senha280',32),(196,'Orlando Lima','olima','senha281',12),(197,'Paulo Nunes','pnunes','senha282',5),(198,'Quésia Lima','qlima','senha283',27),(199,'Renata Nogueira','rnogueira','senha284',22),(200,'Simone Souza','ssouza','senha285',1);
/*!40000 ALTER TABLE `cliente` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `conteudos`
--

DROP TABLE IF EXISTS `conteudos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `conteudos` (
  `id` int NOT NULL AUTO_INCREMENT,
  `nome` varchar(100) NOT NULL,
  `id_categoria` int NOT NULL,
  `id_genero` int DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `conteudos_categoria_FK` (`id_categoria`),
  KEY `conteudos_genero_FK` (`id_genero`),
  CONSTRAINT `conteudos_categoria_FK` FOREIGN KEY (`id_categoria`) REFERENCES `categoria` (`id`),
  CONSTRAINT `conteudos_genero_FK` FOREIGN KEY (`id_genero`) REFERENCES `genero` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=251 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `conteudos`
--

LOCK TABLES `conteudos` WRITE;
/*!40000 ALTER TABLE `conteudos` DISABLE KEYS */;
INSERT INTO `conteudos` VALUES (1,'O Senhor dos Anéis: A Sociedade do Anel',10,1),(2,'Naruto',1,2),(3,'Cosmos: Uma Odisseia do Espaço-Tempo',7,11),(4,'Breaking Bad',21,17),(5,'The Last Dance',7,7),(6,'Stranger Things',21,11),(7,'La Casa de Papel',21,17),(8,'Interstellar',10,11),(9,'Bohemia',6,15),(10,'The Joe Rogan Experience',15,20),(11,'Game of Thrones',21,9),(12,'The Witcher',21,9),(13,'The Beatles: Get Back',7,15),(14,'The Social Network',10,4),(15,'Dunkirk',10,12),(16,'Friends',21,19),(17,'Black Mirror',21,11),(18,'The Lion King',10,2),(19,'Planet Earth',7,5),(20,'TED Talks',23,14),(21,'Westworld',21,11),(22,'Sherlock',21,14),(23,'The Simpsons',17,2),(24,'Marvel\'s Spider-Man',12,11),(25,'The Godfather',10,17),(26,'Rick and Morty',21,11),(27,'The Office',21,19),(28,'Avatar: The Last Airbender',6,9),(29,'Forrest Gump',10,6),(30,'Pulp Fiction',10,22),(31,'Frozen',10,2),(32,'Star Wars: Episode IV - A New Hope',10,11),(33,'Inception',10,22),(34,'The Matrix',10,11),(35,'The Dark Knight',10,1),(36,'Schindler\'s List',10,12),(37,'Seinfeld',21,19),(38,'Mickey Mouse Clubhouse',6,8),(39,'Toy Story',10,2),(40,'The Avengers',10,1),(41,'Guardians of the Galaxy',10,1),(42,'The Crown',21,13),(43,'Narcos',21,17),(44,'House of Cards',21,22),(45,'Big Bang Theory',21,19),(46,'Peaky Blinders',21,17),(47,'Chernobyl',21,13),(48,'Fargo',21,22),(49,'The Mandalorian',21,11),(50,'Cobra Kai',21,7),(51,'Mad Men',21,6),(52,'Lost',21,14),(53,'Suits',21,17),(54,'The Sopranos',21,17),(55,'Dexter',21,17),(56,'Gotham',21,17),(57,'Brooklyn Nine-Nine',21,19),(58,'How I Met Your Mother',21,19),(59,'Grey\'s Anatomy',21,6),(60,'The Walking Dead',21,21),(61,'Breaking Bad',21,17),(62,'Better Call Saul',21,17),(63,'The Flash',21,11),(64,'Arrow',21,11),(65,'Lucifer',21,11),(66,'Jessica Jones',21,11),(67,'Daredevil',21,11),(68,'The Punisher',21,11),(69,'Agents of S.H.I.E.L.D.',21,11),(70,'Legion',21,11),(71,'Deadpool',10,1),(72,'Logan',10,1),(73,'X-Men: Days of Future Past',10,11),(74,'Spider-Man: Homecoming',10,1),(75,'Thor: Ragnarok',10,1),(76,'Avengers: Infinity War',10,1),(77,'Avengers: Endgame',10,1),(78,'Captain Marvel',10,1),(79,'Black Panther',10,1),(80,'Doctor Strange',10,1),(81,'Ant-Man and the Wasp',10,1),(82,'Guardians of the Galaxy Vol. 2',10,1),(83,'Captain America: Civil War',10,1),(84,'Iron Man 3',10,1),(85,'Thor: The Dark World',10,1),(86,'The Avengers',10,1),(87,'Captain America: The Winter Soldier',10,1),(88,'Thor',10,1),(89,'Iron Man 2',10,1),(90,'The Incredible Hulk',10,1),(91,'Iron Man',10,1),(92,'Toy Story 4',10,2),(93,'Finding Nemo',10,2),(94,'Inside Out',10,2),(95,'Zootopia',10,2),(96,'Coco',10,2),(97,'Moana',10,2),(98,'Frozen II',10,2),(99,'Tangled',10,2),(100,'Brave',10,2),(101,'Wreck-It Ralph',10,2),(102,'Big Hero 6',10,2),(103,'The Incredibles',10,2),(104,'The Incredibles 2',10,2),(105,'Cars',10,2),(106,'Ratatouille',10,2),(107,'Up',10,2),(108,'WALL-E',10,2),(109,'Monsters, Inc.',10,2),(110,'A Bug\'s Life',10,2),(111,'Finding Dory',10,2),(112,'The Good Dinosaur',10,2),(113,'Toy Story 3',10,2),(114,'Cars 2',10,2),(115,'Monsters University',10,2),(116,'Toy Story 2',10,2),(117,'The LEGO Movie',10,2),(118,'Shrek',10,2),(119,'Shrek 2',10,2),(120,'Shrek the Third',10,2),(121,'Shrek Forever After',10,2),(122,'Puss in Boots',10,2),(123,'Kung Fu Panda',10,2),(124,'Kung Fu Panda 2',10,2),(125,'Kung Fu Panda 3',10,2),(126,'Madagascar',10,2),(127,'Madagascar: Escape 2 Africa',10,2),(128,'Madagascar 3: Europe\'s Most Wanted',10,2),(129,'Penguins of Madagascar',10,2),(130,'How to Train Your Dragon',10,2),(131,'How to Train Your Dragon 2',10,2),(132,'How to Train Your Dragon: The Hidden World',10,2),(133,'The Boss Baby',10,2),(134,'Trolls',10,2),(135,'Home',10,2),(136,'Mr. Peabody & Sherman',10,2),(137,'The Croods',10,2),(138,'Turbo',10,2),(139,'Rise of the Guardians',10,2),(140,'Puss in Boots',10,2),(141,'Megamind',10,2),(142,'Monsters vs. Aliens',10,2),(143,'Bee Movie',10,2),(144,'Over the Hedge',10,2),(145,'Chicken Run',10,2),(146,'Antz',10,2),(147,'Sinbad: Legend of the Seven Seas',10,2),(148,'Spirit: Stallion of the Cimarron',10,2),(149,'The Road to El Dorado',10,2),(150,'Shark Tale',10,2),(151,'Flushed Away',10,2),(152,'Hoodwinked!',10,2),(153,'Open Season',10,2),(154,'Cloudy with a Chance of Meatballs',10,2),(155,'Hotel Transylvania',10,2),(156,'Hotel Transylvania 2',10,2),(157,'Hotel Transylvania 3: Summer Vacation',10,2),(158,'The Emoji Movie',10,2),(159,'Storks',10,2),(160,'The Angry Birds Movie',10,2),(161,'The Angry Birds Movie 2',10,2),(162,'The Secret Life of Pets',10,2),(163,'The Secret Life of Pets 2',10,2),(164,'Minions',10,2),(165,'Despicable Me',10,2),(166,'Despicable Me 2',10,2),(167,'Despicable Me 3',10,2),(168,'Sing',10,2),(169,'Zombieland',10,21),(170,'Zombieland: Double Tap',10,21),(171,'Shaun of the Dead',10,21),(172,'28 Days Later',10,21),(173,'28 Weeks Later',10,21),(174,'World War Z',10,21),(175,'Resident Evil',10,21),(176,'Resident Evil: Apocalypse',10,21),(177,'Resident Evil: Extinction',10,21),(178,'Resident Evil: Afterlife',10,21),(179,'Resident Evil: Retribution',10,21),(180,'Resident Evil: The Final Chapter',10,21),(181,'The Conjuring',10,21),(182,'The Conjuring 2',10,21),(183,'Annabelle',10,21),(184,'Annabelle: Creation',10,21),(185,'Annabelle Comes Home',10,21),(186,'The Nun',10,21),(187,'It',10,21),(188,'It Chapter Two',10,21),(189,'The Exorcist',10,21),(190,'The Shining',10,21),(191,'Hereditary',10,21),(192,'Midsommar',10,21),(193,'A Quiet Place',10,21),(194,'A Quiet Place Part II',10,21),(195,'Get Out',10,21),(196,'Us',10,21),(197,'The Babadook',10,21),(198,'Donnie Darko',10,21),(199,'Paranormal Activity',10,21),(200,'Paranormal Activity 2',10,21),(201,'Paranormal Activity 3',10,21),(202,'Paranormal Activity 4',10,21),(203,'Paranormal Activity: The Marked Ones',10,21),(204,'Paranormal Activity: The Ghost Dimension',10,21),(205,'Insidious',10,21),(206,'Insidious: Chapter 2',10,21),(207,'Insidious: Chapter 3',10,21),(208,'Insidious: The Last Key',10,21),(209,'Sinister',10,21),(210,'Sinister 2',10,21),(211,'The Ring',10,21),(212,'The Ring Two',10,21),(213,'Rings',10,21),(214,'Poltergeist',10,21),(215,'Poltergeist II: The Other Side',10,21),(216,'Poltergeist III',10,21),(217,'The Blair Witch Project',10,21),(218,'Blair Witch',10,21),(219,'Halloween',10,21),(220,'Halloween II',10,21),(221,'Halloween III: Season of the Witch',10,21),(222,'Halloween 4: The Return of Michael Myers',10,21),(223,'Halloween 5: The Revenge of Michael Myers',10,21),(224,'Halloween: The Curse of Michael Myers',10,21),(225,'Halloween H20: 20 Years Later',10,21),(226,'Halloween: Resurrection',10,21),(227,'Halloween (2007)',10,21),(228,'Halloween II (2009)',10,21),(229,'Halloween (2018)',10,21),(230,'The Texas Chain Saw Massacre',10,21),(231,'The Texas Chainsaw Massacre 2',10,21),(232,'Leatherface: The Texas Chainsaw Massacre III',10,21),(233,'The Texas Chainsaw Massacre: The Next Generation',10,21),(234,'The Texas Chainsaw Massacre (2003)',10,21),(235,'The Texas Chainsaw Massacre: The Beginning',10,21),(236,'Texas Chainsaw 3D',10,21),(237,'Leatherface',10,21),(238,'Saw',10,21),(239,'Saw II',10,21),(240,'Saw III',10,21),(241,'Saw IV',10,21),(242,'Saw V',10,21),(243,'Saw VI',10,21),(244,'Saw 3D',10,21),(245,'Jigsaw',10,21),(246,'Spiral: From the Book of Saw',10,21),(247,'Hostel',10,21),(248,'Hostel: Part II',10,21),(249,'Hostel: Part III',10,21),(250,'Cabin Fever',10,21);
/*!40000 ALTER TABLE `conteudos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `genero`
--

DROP TABLE IF EXISTS `genero`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `genero` (
  `id` int NOT NULL AUTO_INCREMENT,
  `nome` varchar(100) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=27 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `genero`
--

LOCK TABLES `genero` WRITE;
/*!40000 ALTER TABLE `genero` DISABLE KEYS */;
INSERT INTO `genero` VALUES (1,'Ação'),(2,'Animação'),(3,'Aventura'),(4,'Biografia'),(5,'Documentário'),(6,'Drama'),(7,'Esporte'),(8,'Família'),(9,'Fantasia'),(10,'Fantasia Científica'),(11,'Ficção Científica'),(12,'Guerra'),(13,'Histórico'),(14,'Mistério'),(15,'Musical'),(16,'Noir'),(17,'Policial'),(18,'Reality Show'),(19,'Romance'),(20,'Talk Show'),(21,'Terror'),(22,'Thriller'),(23,'Variedades'),(24,'Western');
/*!40000 ALTER TABLE `genero` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `nivel_acesso`
--

DROP TABLE IF EXISTS `nivel_acesso`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `nivel_acesso` (
  `id` int NOT NULL AUTO_INCREMENT,
  `nome` varchar(100) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `nivel_acesso`
--

LOCK TABLES `nivel_acesso` WRITE;
/*!40000 ALTER TABLE `nivel_acesso` DISABLE KEYS */;
INSERT INTO `nivel_acesso` VALUES (1,'administrador'),(2,'vendedor'),(3,'cliente');
/*!40000 ALTER TABLE `nivel_acesso` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `vendedor`
--

DROP TABLE IF EXISTS `vendedor`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `vendedor` (
  `id` int NOT NULL AUTO_INCREMENT,
  `nome` varchar(100) NOT NULL,
  `usuario` varchar(100) NOT NULL,
  `senha` varchar(100) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=51 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `vendedor`
--

LOCK TABLES `vendedor` WRITE;
/*!40000 ALTER TABLE `vendedor` DISABLE KEYS */;
INSERT INTO `vendedor` VALUES (0,'admin','admin','123'),(1,'João Silva','jsilva','senha123'),(2,'Maria Oliveira','moliveira','senha456'),(3,'Carlos Souza','csouza','senha789'),(4,'Ana Pereira','apereira','senha321'),(5,'Paulo Santos','psantos','senha654'),(6,'Luciana Costa','lcosta','senha987'),(7,'Marcos Almeida','malmeida','senha111'),(8,'Fernanda Lima','flima','senha222'),(9,'Rafael Rodrigues','rrodrigues','senha333'),(10,'Juliana Fernandes','jfernandes','senha444'),(11,'Renato Carvalho','rcarvalho','senha555'),(12,'Bruna Mendes','bmendes','senha666'),(13,'Eduardo Araújo','earaujo','senha777'),(14,'Tatiane Ferreira','tferreira','senha888'),(15,'André Ribeiro','aribeiro','senha999'),(16,'Camila Martins','cmartins','senha101'),(17,'Gustavo Lima','glima','senha102'),(18,'Vanessa Nogueira','vnogueira','senha103'),(19,'Leandro Barros','lbarros','senha104'),(20,'Patrícia Gomes','pgomes','senha105'),(21,'Rodrigo Batista','rbatista','senha106'),(22,'Marta Moreira','mmoreira','senha107'),(23,'Bruno Correia','bcorreia','senha108'),(24,'Isabela Rocha','irocha','senha109'),(25,'Thiago Dias','tdias','senha110'),(26,'Elaine Teixeira','eteixeira','senha111'),(27,'Ricardo Monteiro','rmonteiro','senha112'),(28,'Sabrina Pinto','spinto','senha113'),(29,'Felipe Marques','fmarques','senha114'),(30,'Juliana Vieira','jvieira','senha115'),(31,'Adriana Almeida','aalmeida','senha116'),(32,'Fernando Freitas','ffreitas','senha117'),(33,'Carolina Batista','cbatista','senha118'),(34,'Marcelo Borges','mborges','senha119'),(35,'Gabriela Farias','gfarias','senha120'),(36,'Douglas Cunha','dcunha','senha121'),(37,'Natália Barbosa','nbarbosa','senha122'),(38,'Igor Maciel','imaciel','senha123'),(39,'Viviane Lima','vlima','senha124'),(40,'Rafael Matos','rmatos','senha125'),(41,'Daniela Lopes','dlopes','senha126'),(42,'Alexandre Rocha','arocha','senha127'),(43,'Paula Souza','psouza','senha128'),(44,'Henrique Silva','hsilva','senha129'),(45,'Lúcia Martins','lmartins','senha130'),(46,'Gabriel Mendes','gmendes','senha131'),(47,'Renata Santos','rsantos','senha132'),(48,'Cláudio Almeida','calmeida','senha133'),(49,'Larissa Oliveira','loliveira','senha134'),(50,'Victor Ferreira','vferreira','senha135');
/*!40000 ALTER TABLE `vendedor` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping routines for database 'projetointegradordesistema'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-07-25 14:25:33
