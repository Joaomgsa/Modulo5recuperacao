CREATE TABLE `minhaviagem`.`book` (
 `id` INT NOT NULL,
 `title` VARCHAR(255) NULL,
 `price` float(24) NULL,
 `imagesrc` VARCHAR(255) NULL,
 PRIMARY KEY (`id`));

 ALTER TABLE `minhaviagem`.`book`
 CHANGE COLUMN `id` `id` INT(11) NOT NULL AUTO_INCREMENT ,
 ADD UNIQUE INDEX `id_UNIQUE` (`id` ASC);
