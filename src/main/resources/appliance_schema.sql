-- DROP SCHEMA appliance;

CREATE SCHEMA appliance AUTHORIZATION appliance;


CREATE TABLE IF NOT EXISTS appliance.appliances (
	id bigint NOT NULL,
	factory_nr varchar(250) NOT NULL,
	aid varchar(250) NOT NULL,
	CONSTRAINT appliances_pk PRIMARY KEY (id)
);

CREATE TABLE IF NOT EXISTS appliance.customer (
	id bigint NOT NULL,
	"name" varchar(250) NOT NULL,
	address varchar(250) NOT NULL,
	CONSTRAINT customer_pk PRIMARY KEY (id)
);

CREATE TABLE appliance.customer_appliances (
	id bigint NOT NULL,
	customer_id bigint NOT NULL,
	appliance_id varchar(250) NOT NULL
);


CREATE TABLE appliance.machinery (
	id bigint NOT NULL,
	appliance_id varchar(250) NOT NULL,
	active bool NOT NULL,
	updated_on timestamptz NOT NULL
);
