create table c_about_us (
	cid LONG not null primary key,
	profile_id LONG,
	text_ VARCHAR(75) null
);

create table c_acheivments (
	cid LONG not null primary key
);

create table c_cfm (
	cid LONG not null primary key,
	cfm_by LONG,
	cfm_to LONG,
	cfm_type_id LONG
);

create table c_club (
	cid LONG not null primary key,
	name VARCHAR(75) null,
	admin_user_id LONG
);

create table c_club_users (
	cid LONG not null primary key,
	club_id LONG,
	user_id LONG
);

create table c_genere_master (
	cid LONG not null primary key,
	name VARCHAR(75) null
);

create table c_hit_count (
	cid LONG not null primary key,
	profile_id LONG,
	user_id LONG,
	counter LONG,
	highfive LONG
);

create table c_media_link_master (
	cid LONG not null primary key,
	name VARCHAR(75) null
);

create table c_media_links (
	cid LONG not null primary key,
	profile_id LONG,
	media_type_id LONG,
	link VARCHAR(75) null
);

create table c_messages (
	cid LONG not null primary key
);

create table c_notifications (
	cid LONG not null primary key
);

create table c_profile (
	cid LONG not null primary key,
	type_id LONG,
	genere_id LONG,
	user_id LONG,
	profile_name VARCHAR(75) null
);

create table c_profile_social_link (
	cid LONG not null primary key,
	social_type_id LONG,
	link VARCHAR(75) null,
	profile_id LONG
);

create table c_recommendations (
	cid LONG not null primary key
);

create table c_skill (
	cid LONG not null primary key,
	name VARCHAR(75) null,
	genere_id LONG
);

create table c_skill_user_mapping (
	cid LONG not null primary key,
	skill_id LONG,
	profile_id LONG,
	type_id LONG
);

create table c_social_login (
	cid LONG not null primary key,
	social_type_id LONG,
	profile_id LONG,
	social_id LONG
);

create table c_social_type_master (
	cid LONG not null primary key,
	name VARCHAR(75) null
);

create table c_type_master (
	cid LONG not null primary key,
	name VARCHAR(75) null
);

create table c_user_contact (
	cid LONG not null primary key,
	profile_id LONG,
	user_id LONG,
	email VARCHAR(75) null,
	phone VARCHAR(75) null,
	dob DATE null,
	city VARCHAR(75) null,
	gender VARCHAR(75) null
);

create table database_cfm_master (
	cid LONG not null primary key,
	name VARCHAR(75) null
);