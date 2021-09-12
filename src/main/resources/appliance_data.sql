INSERT INTO appliance.appliances (id, factory_nr, aid) VALUES(0, 'ABC123','YS2R4X20005399401');
INSERT INTO appliance.appliances (id, factory_nr, aid) VALUES(1, 'DEF456','VLUR4X20009093588');
INSERT INTO appliance.appliances (id, factory_nr, aid) VALUES(2, 'GHI789','VLUR4X20009048066');
INSERT INTO appliance.appliances (id, factory_nr, aid) VALUES(3, 'JKL012','YS2R4X20005388011');
INSERT INTO appliance.appliances (id, factory_nr, aid) VALUES(4, 'MNO345','YS2R4X20005387949');
INSERT INTO appliance.appliances (id, factory_nr, aid) VALUES(5, 'PQR678','YS2R4X20009048066');
INSERT INTO appliance.appliances (id, factory_nr, aid) VALUES(6, 'STU901','YS2R4X20005387055');

INSERT INTO appliance.customer (id, "name", address) VALUES(0, 'Kalles Grustransporter AB', 'Cementvägen 8, 111 11 Södertälje');
INSERT INTO appliance.customer (id, "name", address) VALUES(1, 'Johans Bulk AB', 'Balkvägen 12, 222 22 Stockholm');
INSERT INTO appliance.customer (id, "name", address) VALUES(2, 'Haralds Värdetransporter AB', 'Budgetvägen 1, 333 33 Uppsala');


INSERT INTO appliance.customer_appliances (id, customer_id, appliance_id) VALUES(0, 0, 'YS2R4X20005399401');
INSERT INTO appliance.customer_appliances (id, customer_id, appliance_id) VALUES(1, 0, 'VLUR4X20009093588');
INSERT INTO appliance.customer_appliances (id, customer_id, appliance_id) VALUES(2, 0, 'VLUR4X20009048066');
INSERT INTO appliance.customer_appliances (id, customer_id, appliance_id) VALUES(3, 1, 'VLUR4X20009048066');
INSERT INTO appliance.customer_appliances (id, customer_id, appliance_id) VALUES(4, 1, 'VLUR4X20009048066');
INSERT INTO appliance.customer_appliances (id, customer_id, appliance_id) VALUES(5, 2, 'YS2R4X20009048066');
INSERT INTO appliance.customer_appliances (id, customer_id, appliance_id) VALUES(6, 2, 'YS2R4X20005387055');


INSERT INTO appliance.machinery (id, appliance_id, active, updated_on) VALUES(0, 'YS2R4X20005399401', true, now());
INSERT INTO appliance.machinery (id, appliance_id, active, updated_on) VALUES(1, 'VLUR4X20009093588', true, now());
INSERT INTO appliance.machinery (id, appliance_id, active, updated_on) VALUES(2, 'VLUR4X20009048066', true, now());
INSERT INTO appliance.machinery (id, appliance_id, active, updated_on) VALUES(3, 'YS2R4X20005388011', true, now());
INSERT INTO appliance.machinery (id, appliance_id, active, updated_on) VALUES(4, 'YS2R4X20005387949', true, now());
INSERT INTO appliance.machinery (id, appliance_id, active, updated_on) VALUES(5, 'YS2R4X20009048066', true, now());
INSERT INTO appliance.machinery (id, appliance_id, active, updated_on) VALUES(6, 'YS2R4X20005387055', true, now());