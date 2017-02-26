CREATE DATABASE flightDatabase;
CREATE TABLE FlightDB
  (
  FlightID INT PRIMARY KEY,
  departureLocation VARCHAR(255),
  departureDestination VARCHAR(255),
  /*departureDestinationCountry VARCHAR(255)*/
  departureDate DATE,
  departureTime TIME
  );
  INSERT INTO FlightDB(FlightID,departureLocation,departureDestination,departureDate,departureTime)
  VALUES('1','Reykjavik, Iceland','Copenhagen, Denmark','22/02/2017','21:48');
CREATE TABLE FlightInfoDB
  (
  KeyID INT PRIMARY KEY,
  flightConnectKey INT,
  planeModel VARCHAR(255),
  seatsLeft INT,
  seatNr VARCHAR(255),
  /*pæling að hafa seatNr og seatString til að geta raðað frá A til F við hvert sæti?*/
  toiletNr INT,
  FOREIGN KEY (flightConnectKey) REFERENCES FlightDB(FlightID)
  );

  INSERT INTO FlightInfoDB(KeyID, flightConnectKey,planeModel,seatsLeft,SeatNr,toiletNr)
  VALUES('1','1','Boeing 747', '467','1A','400');
CREATE TABLE Accountinfo
  (
    accountNR INT PRIMARY KEY,
    accountName VARCHAR (255),
    accountPW VARCHAR (255),
    accountEmail VARCHAR (255),
    pastFlights INT,
    FOREIGN KEY (pastFlights) REFERENCES FlightDB(FlightID)
  );
  INSERT INTO Accountinfo(accountNR,accountName,accountPW,accountEmail,pastFlights)
  VALUES('1','Indriði Arnaldsson','Lykilorðið mitt er þetta','ina23@hi.is','1');