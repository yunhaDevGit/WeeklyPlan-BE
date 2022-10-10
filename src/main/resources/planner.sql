
drop database `weekly_plan`;
create database `weekly_plan`;

use `weekly_plan`;

drop table `schedule`;

create table `schedule` (
    `id` varchar(255) primary key,
    `title` varchar(255),
    `detail` varchar(255),
    `created_at` timestamp,
    `updated_at` timestamp
);

drop table `schedule_date`;

create table `schedule_date`(
    `id` varchar(255) primary key,
    `schedule_id` varchar(255),
    `date` timestamp,
    `created_at` timestamp,
    `updated_at` timestamp,
    foreign key(`schedule_id`) references schedule(`id`)
);