# Employee App

{add test badges here, all projects you build from here on out will have tests, therefore you should have github workflow badges at the top of your repositories: [Github Workflow Badges](https://docs.github.com/en/actions/monitoring-and-troubleshooting-workflows/adding-a-workflow-status-badge)}

## Demo & Snippets

- Include hosted link
- Include images of app if CLI or Client App

---

## Requirements / Purpose

- MVP
- purpose of project
- stack used and why

---

## Build Steps

- how to build / run project
- use proper code snippets if there are any commands to run

---

## Design Goals / Approach

- Design goals
- why did you implement it the way you did?

---

## Features

- What features does the project have?
- list them...

---

## Known issues

- Remaining bugs, things that have been left unfixed
- Features that are buggy / flimsy

---

## Future Goals

- What are the immediate features you'd add given more time

---

## Change logs

- Write a paragraph labelled with the date every day you work on the project to discuss what you've done for the day. Be specific about the changes that have happened for that day.

### 2026-10-20 - Employee entity and tests

- Created the Employee entity and Title / ContractType enums
- Created entity tests
- Key things that I learned
  - isOngoing is not stored as a column, it is derived from endDate == null
  - @Column only where defaults change
  - enums stored as names (EnumType.STRING)

### 2026-10-21 - Flyway migration setup

- Started the Flyway V1 migration
- Entity-to-table mapping

### 2026-10-25 - Flyway and seeder

- Ran the app and hig Hibrernate missing table [employees]
- Found the mismatch: the migration created employee, but entity's @Table expects employees
- Fixed the CREATE TABLE name to employees
- Reset the local Flyway history and old table, then re-ran V1
- Hibernate validation passed
- Added seeder

---

## What did you struggle with?

- What? Why? How?

---

## Licensing Details

- What type of license are you releasing this under?

---

## Further details, related projects, reimplementations

- Is this project a reimplementation for something you've done in the past? if so explain it and link it here.
- If it's an API, is there a client app that works with this project? link it
