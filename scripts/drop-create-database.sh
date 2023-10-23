
#!/bin/bash
set -e

# This script is used to drop and recreate the meta-data tables

docker exec some-postgres psql -f /mnt/schema-drop-postgresql.sql -U postgres
docker exec some-postgres psql -f /mnt/schema-postgresql.sql -U postgres
